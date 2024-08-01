module com.statickev.financeappdemo {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.statickev.financeappdemo to javafx.fxml;
    exports com.statickev.financeappdemo;
}