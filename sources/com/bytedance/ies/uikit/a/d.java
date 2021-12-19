package com.bytedance.ies.uikit.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.AwemeAppData;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static AbstractC0805d f35380a;

    /* renamed from: b  reason: collision with root package name */
    public static a f35381b;

    /* renamed from: c  reason: collision with root package name */
    static b f35382c;

    /* renamed from: d  reason: collision with root package name */
    public static c f35383d;

    public interface a {
        static {
            Covode.recordClassIndex(21173);
        }

        void a(Activity activity);

        void b(Activity activity);
    }

    public interface b {
        static {
            Covode.recordClassIndex(21174);
        }

        boolean a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(21175);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.a.d$d  reason: collision with other inner class name */
    public interface AbstractC0805d {
        static {
            Covode.recordClassIndex(21176);
        }
    }

    static {
        Covode.recordClassIndex(21172);
    }

    public static a a() {
        if (!com.ss.android.ugc.aweme.lego.d.e()) {
            return f35381b;
        }
        if (com.ss.android.ugc.aweme.account.b.g().isChildrenMode()) {
            return com.ss.android.ugc.aweme.kids.intergration.common.a.f106699a;
        }
        return AwemeAppData.a();
    }
}
