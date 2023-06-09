import model.Service;
import ui.Console;
import ui.View;
import presenter.Presenter;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        View view = new Console();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);

        view.start();
    }
}
