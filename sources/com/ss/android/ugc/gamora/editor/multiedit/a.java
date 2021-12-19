package com.ss.android.ugc.gamora.editor.multiedit;

import androidx.lifecycle.LiveData;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;

public interface a extends b {
    static {
        Covode.recordClassIndex(96065);
    }

    void a();

    void a(boolean z, boolean z2);

    boolean b();

    LiveData<Boolean> c();

    LiveData<Boolean> e();
}
