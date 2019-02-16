
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

import controllers.SimulatorController;
import models.Arena;
import models.MyRobot;
import utils.FileReaderWriter;
import views.*;
import static models.Constants.*;

public class App extends JFrame {
    // Views
    private JPanel contentPane;
    private CenterPanel centerPanel;
    private EastPanel eastPanel;
    private WestPanel westPanel;

    // Models
    private Arena arena;
    private Arena referenceArena;
    private MyRobot myRobot;

    //Controller
    private SimulatorController westPanelController;
    private SimulatorController centerPanelController;
    private SimulatorController eastPanelController;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    App frame = new App();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public App() {
        setResizable(false);
        setTitle("MDP Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setSize(APP_WIDTH, APP_HEIGHT);
        pack();
        setLocationRelativeTo(null);

    }





    private void initComponents() {



        // Models
        referenceArena = new Arena();
        try {
            FileReaderWriter fileReader = new FileReaderWriter(java.nio.file.FileSystems.getDefault().getPath(ARENA_DESCRIPTOR_PATH, new String[0]));
            referenceArena.binStringToArena(fileReader.read());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myRobot = new MyRobot(18, 1, Orientation.N, referenceArena);
        arena = new Arena();

        // Views
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        centerPanel = new CenterPanel();
        centerPanel.setBackground(null);
        centerPanel.setVisible(true);
        contentPane.add(centerPanel, BorderLayout.CENTER);

        westPanel = new WestPanel(myRobot, arena);
        westPanel.setBackground(null);
        westPanel.setVisible(true);
        contentPane.add(westPanel, BorderLayout.WEST);

        eastPanel = new EastPanel(referenceArena);
        eastPanel.setBackground(null);
        eastPanel.setVisible(true);
        contentPane.add(eastPanel, BorderLayout.EAST);

        // Controllers
        westPanelController = new SimulatorController(westPanel);
        centerPanelController = new SimulatorController(centerPanel);
        eastPanelController = new SimulatorController(eastPanel);

    }
}