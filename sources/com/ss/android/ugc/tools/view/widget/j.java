package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static b f150446a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f150447b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final Context f150448c;

    /* renamed from: d  reason: collision with root package name */
    private final String f150449d;

    /* renamed from: e  reason: collision with root package name */
    private final int f150450e;

    /* renamed from: f  reason: collision with root package name */
    private final int f150451f;

    public interface b {
        static {
            Covode.recordClassIndex(98930);
        }

        void a(Context context, String str, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(98928);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98929);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static j a(Context context, int i2, int i3) {
            String str;
            if (context != null) {
                str = context.getString(i2);
            } else {
                str = null;
            }
            return a(context, str, i3);
        }

        public static j b(Context context, int i2, int i3) {
            String str;
            if (context != null) {
                str = context.getString(i2);
            } else {
                str = null;
            }
            return b(context, str, i3);
        }

        public static j a(Context context, String str, int i2) {
            return new j(context, str, i2, 2, (byte) 0);
        }

        public static j b(Context context, String str, int i2) {
            return new j(context, str, i2, 3, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f150452a = new c();

        private c() {
        }

        static {
            Covode.recordClassIndex(98931);
        }

        @Override // com.ss.android.ugc.tools.view.widget.j.b
        public final void a(Context context, String str, int i2, int i3) {
            if (context != null && str != null && str.length() != 0) {
                Toast makeText = Toast.makeText(context, str, i2);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }
        }
    }

    public final void a() {
        String str;
        if (this.f150448c != null && (str = this.f150449d) != null && str.length() != 0) {
            b bVar = f150446a;
            if (bVar == null) {
                bVar = c.f150452a;
            }
            bVar.a(this.f150448c, this.f150449d, this.f150450e, this.f150451f);
        }
    }

    public static final j a(Context context, int i2) {
        return a.a(context, i2, 0);
    }

    public static final j b(Context context, String str) {
        return a.b(context, str, 0);
    }

    public static final j a(Context context, String str) {
        return a.a(context, str, 0);
    }

    private j(Context context, String str, int i2, int i3) {
        this.f150448c = context;
        this.f150449d = str;
        this.f150450e = i2;
        this.f150451f = i3;
    }

    public /* synthetic */ j(Context context, String str, int i2, int i3, byte b2) {
        this(context, str, i2, i3);
    }
}
