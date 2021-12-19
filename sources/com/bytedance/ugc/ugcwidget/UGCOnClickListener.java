package com.bytedance.ugc.ugcwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class UGCOnClickListener implements View.OnClickListener {
    private long interval;
    private long timeMillis;

    static {
        Covode.recordClassIndex(27963);
    }

    public abstract void doClick(View view);

    public long getInterval() {
        return this.interval;
    }

    public UGCOnClickListener() {
        this(500);
    }

    public void setInterval(long j2) {
        this.interval = j2;
    }

    public UGCOnClickListener(long j2) {
        this.interval = j2;
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.timeMillis < currentTimeMillis) {
            this.timeMillis = currentTimeMillis + this.interval;
            doClick(view);
        }
    }
}
