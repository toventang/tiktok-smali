package com.ss.android.ugc.aweme.shortvideo.ui.creationflow;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.w.f;
import h.f.b.l;
import h.z;

public abstract class b<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(86213);
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a extends b<Intent> {

        /* renamed from: a  reason: collision with root package name */
        public final a f131656a;

        static {
            Covode.recordClassIndex(86214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a aVar) {
            super((byte) 0);
            l.d(aVar, "");
            this.f131656a = aVar;
        }
    }

    public static final class c extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f131661a;

        static {
            Covode.recordClassIndex(86216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super((byte) 0);
            l.d(activity, "");
            this.f131661a = activity;
        }
    }

    public static final class d extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f131662a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f131663b;

        static {
            Covode.recordClassIndex(86217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Activity activity, boolean z) {
            super((byte) 0);
            l.d(activity, "");
            this.f131662a = activity;
            this.f131663b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b$b  reason: collision with other inner class name */
    public static final class C3421b extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f131657a;

        /* renamed from: b  reason: collision with root package name */
        public final f f131658b;

        /* renamed from: c  reason: collision with root package name */
        public final ShortVideoContext f131659c;

        /* renamed from: d  reason: collision with root package name */
        public final int f131660d;

        static {
            Covode.recordClassIndex(86215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3421b(Activity activity, f fVar, ShortVideoContext shortVideoContext, int i2) {
            super((byte) 0);
            l.d(activity, "");
            l.d(fVar, "");
            l.d(shortVideoContext, "");
            this.f131657a = activity;
            this.f131658b = fVar;
            this.f131659c = shortVideoContext;
            this.f131660d = i2;
        }
    }
}
