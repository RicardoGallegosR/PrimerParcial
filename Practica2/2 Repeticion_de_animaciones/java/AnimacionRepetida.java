
import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animationütils;
import android.widget.TextView;

public class AnimacionRepetida extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.main);
        TextView tv= (TextView) findViewByld(R.id.texto);
        Animation td = AnimationUtils.loadAnimation(this,
        R.anim.traslación);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        //td.setFillAfter(true);
        tv.startAnimation(td);
        tv.append("\nRepeatMode: "+td.getRepeatMode())/
        tv.append("\nRepeatCount:"+td.getRepeatCount())/
    }
}