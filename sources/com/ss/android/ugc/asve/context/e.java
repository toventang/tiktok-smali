package com.ss.android.ugc.asve.context;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.d;
import com.ss.android.ugc.asve.editor.h;
import com.ss.android.ugc.asve.recorder.c;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.k;
import java.io.File;
import java.util.Map;

public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f61951a = a.f61952a;

    static {
        Covode.recordClassIndex(38090);
    }

    d a();

    c b();

    VEListener.d c();

    ResourceFinder d();

    File e();

    int f();

    boolean g();

    int h();

    boolean i();

    int j();

    int k();

    int l();

    k m();

    PreviewSize n();

    String o();

    boolean p();

    Map<String, Object> q();

    h r();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f61952a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(38091);
        }
    }
}
