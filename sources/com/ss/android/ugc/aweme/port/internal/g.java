package com.ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

public interface g {

    public interface a {
        static {
            Covode.recordClassIndex(74629);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(74628);
    }

    View a();

    void a(Context context, IRecordingOperationPanel iRecordingOperationPanel);

    void a(ViewGroup viewGroup);

    void a(ViewGroup viewGroup, Bundle bundle);

    void a(a aVar);

    void a(View... viewArr);
}
