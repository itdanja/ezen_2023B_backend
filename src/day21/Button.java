package day21;

public class Button {
    public interface ClickListener {      void onClick();  }
    // 필드
    private ClickListener clickListener;
    // 메소드
    public void setClickListener( ClickListener  clickListener ){
        this.clickListener = clickListener;
    }
    // 메소드
    public void click(){     this.clickListener.onClick();    }
}
