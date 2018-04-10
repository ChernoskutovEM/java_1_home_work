package ru.geekbrains.tic_tac_toe;

public class Button {

    private OnClickListener listener;

    public void setOnclickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if(listener != null) listener.onClick(this);
    }
}
