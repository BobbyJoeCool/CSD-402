/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 11.2
    Due Date: March 15th, 2026
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Minesweeper Layout Demonstration
 *
 * This JavaFX application demonstrates how several layout panes work together:
 * - BorderPane as the root layout - FlowPane for the top menu bar - VBox for
 * the left stats panel - GridPane for the center game board - HBox for the
 * bottom footer
 *
 * CSD 402 - Assignment 11.2 By: Robert Breutzmann
 */
public class App extends Application {

    /**
     * The main entry point for the JavaFX application.
     *
     * @param stage The primary stage for the application
     */
    @Override
    public void start(Stage stage) {
        // Create the root layout (BorderPane)
        BorderPane root = new BorderPane();

        // Create and set the top region (FlowPane menu bar)
        root.setTop(createTopMenuBar());

        // Create and set the left region (VBox stats panel)
        root.setLeft(createLeftStatsPanel());

        // Create and set the center region (GridPane game board)
        root.setCenter(createCenterGameBoard());

        // Create and set the bottom region (HBox footer)
        root.setBottom(createBottomFooter());

        // Create the scene with the root layout
        Scene scene = new Scene(root, 800, 600);

        // Set up the stage
        stage.setTitle("Minesweeper - Layout Demonstration");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Creates the top region containing a FlowPane with menu buttons.
     *
     * @return A FlowPane containing menu buttons
     */
    private FlowPane createTopMenuBar() {
        FlowPane topPane = new FlowPane();
        topPane.setHgap(10);  // Horizontal gap between buttons
        topPane.setVgap(10);  // Vertical gap (for wrapping)
        topPane.setPadding(new Insets(10));  // Padding around edges
        topPane.setStyle("-fx-background-color: #f0f0f0;"); // Light gray background

        // Create menu buttons
        String[] buttonLabels = {"New Game", "Beginner", "Intermediate", "Expert", "Reset"};
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setStyle("-fx-padding: 8px 20px;");
            topPane.getChildren().add(button);
        }

        return topPane;
    }

    /**
     * Creates the left region containing a VBox with statistics panel.
     *
     * @return A VBox containing stats labels
     */
    private VBox createLeftStatsPanel() {
        VBox leftPane = new VBox();
        leftPane.setSpacing(15);  // Space between elements
        leftPane.setPadding(new Insets(15));  // Padding around edges
        leftPane.setStyle("-fx-background-color: #e8e8e8;"); // Slightly darker background

        // Create stats labels
        Label difficultyLabel = new Label("Difficulty: Beginner");
        Label minesLabel = new Label("Mines Remaining: 10");
        Label instructionTitle = new Label("Instructions:");
        Label clearLabel = new Label("Left Click: Clear Spot");
        Label markLabel = new Label("Right Click: Mark Mine");

        // Style the title
        instructionTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 12;");

        // Add labels to the VBox
        leftPane.getChildren().addAll(
                difficultyLabel,
                minesLabel,
                instructionTitle,
                clearLabel,
                markLabel
        );

        return leftPane;
    }

    /**
     * Creates the center region containing a GridPane with game board buttons.
     *
     * @return A GridPane representing the 10x10 game board
     */
    private GridPane createCenterGameBoard() {
        GridPane centerPane = new GridPane();
        centerPane.setHgap(2);   // Horizontal gap between cells
        centerPane.setVgap(2);   // Vertical gap between cells
        centerPane.setPadding(new Insets(10));  // Padding around the board
        centerPane.setStyle("-fx-background-color: #cccccc;"); // Dark background for grid

        // Create a 10x10 grid of buttons
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                Button cellButton = new Button();
                cellButton.setMinWidth(30);
                cellButton.setMinHeight(30);
                cellButton.setPrefWidth(30);
                cellButton.setPrefHeight(30);
                cellButton.setMaxWidth(30);
                cellButton.setMaxHeight(30);
                cellButton.setStyle("-fx-font-size: 10;");

                // Add the button to the grid at the specified row and column
                centerPane.add(cellButton, col, row);
            }
        }

        return centerPane;
    }

    /**
     * Creates the bottom region containing an HBox with footer text.
     *
     * @return An HBox containing the footer label
     */
    private HBox createBottomFooter() {
        HBox bottomPane = new HBox();
        bottomPane.setAlignment(javafx.geometry.Pos.CENTER); // Center content
        bottomPane.setPadding(new Insets(10));  // Padding around edges
        bottomPane.setStyle("-fx-background-color: #f0f0f0;"); // Light gray background

        // Create the footer label
        Label footerLabel = new Label("Built By: Robert Breutzmann | CSD 402 - Assignment 11.2");
        footerLabel.setStyle("-fx-font-size: 11;");

        bottomPane.getChildren().add(footerLabel);

        return bottomPane;
    }

    /**
     * The main method to launch the JavaFX application.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        launch(args);
    }
}
