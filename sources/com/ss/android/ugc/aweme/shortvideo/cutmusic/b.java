package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.e;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.l;

public class b extends RelativeLayout {

    public interface a {
        static {
            Covode.recordClassIndex(82910);
        }
    }

    static {
        Covode.recordClassIndex(82909);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void a() {
    }

    public void a(float f2) {
    }

    public void b(float f2) {
    }

    public void setAudioWaveViewData(d dVar) {
    }

    public void setBubbleText(String str) {
    }

    public void setBubbleTextViewAttribute(e.a aVar) {
        l.d(aVar, "");
    }

    public void setOnScreenMaxWavePointCount(int i2) {
    }

    public void setScrollListener(f.a aVar) {
        l.d(aVar, "");
    }

    public void setSoundLoopClickable(boolean z) {
    }

    public void setSoundLoopListener(a aVar) {
        l.d(aVar, "");
    }

    public void setSoundLoopSelected(boolean z) {
    }

    public void setTimeBubble(int i2) {
    }

    private /* synthetic */ b(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2583);
        MethodCollector.o(2583);
    }
}
