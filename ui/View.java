package ui;

import presenter.Presenter;

public interface View {
    
    void print(String text);

    void start() throws ClassNotFoundException;

    void setPresenter(Presenter presenter);
}
