package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEListener;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: k  reason: collision with root package name */
    public static final a f125924k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f125925a;

    /* renamed from: b  reason: collision with root package name */
    int f125926b;

    /* renamed from: c  reason: collision with root package name */
    VideoSegment f125927c;

    /* renamed from: d  reason: collision with root package name */
    int f125928d;

    /* renamed from: e  reason: collision with root package name */
    List<? extends VideoSegment> f125929e;

    /* renamed from: f  reason: collision with root package name */
    b f125930f;

    /* renamed from: g  reason: collision with root package name */
    float f125931g;

    /* renamed from: h  reason: collision with root package name */
    float f125932h;

    /* renamed from: i  reason: collision with root package name */
    final HashSet<String> f125933i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public final HandlerC3278e f125934j = new HandlerC3278e(this, Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a f125935l;

    /* renamed from: m  reason: collision with root package name */
    private Activity f125936m;
    private boolean n;

    public interface b {
        static {
            Covode.recordClassIndex(82743);
        }

        void a();

        void a(boolean z, boolean z2, boolean z3);
    }

    static {
        Covode.recordClassIndex(82741);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82742);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements a.AbstractC3282a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125938a;

        static {
            Covode.recordClassIndex(82745);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a.AbstractC3282a
        public final void a() {
            this.f125938a.a(false, true, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(e eVar) {
            this.f125938a = eVar;
        }
    }

    private final void d() {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar = this.f125935l;
        if (aVar != null && aVar.isShowing()) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar2 = this.f125935l;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.n) {
            com.ss.android.ugc.asve.editor.g gVar = this.f125925a;
            if (gVar == null) {
                l.b();
            }
            gVar.a(this.f125928d, new f(this));
        }
    }

    public final void b() {
        this.n = true;
        com.ss.android.ugc.asve.editor.g gVar = this.f125925a;
        if (gVar != null) {
            gVar.k(this.f125928d);
        }
        this.f125934j.removeCallbacksAndMessages(null);
    }

    private final void c() {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar;
        Activity activity = this.f125936m;
        if (activity != null && !activity.isFinishing() && (aVar = this.f125935l) != null && !aVar.isShowing()) {
            try {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar2 = this.f125935l;
                if (aVar2 == null) {
                    l.b();
                }
                aVar2.show();
                a(0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125937a;

        static {
            Covode.recordClassIndex(82744);
        }

        c(e eVar) {
            this.f125937a = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f125937a.b();
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f125930f = bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements VEListener.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125940a;

        static {
            Covode.recordClassIndex(82747);
        }

        f(e eVar) {
            this.f125940a = eVar;
        }

        @Override // com.ss.android.vesdk.VEListener.i
        public final void a(float f2) {
            Message obtain = Message.obtain();
            obtain.what = 1001;
            obtain.obj = Float.valueOf(f2);
            this.f125940a.f125934j.sendMessage(obtain);
        }
    }

    static final class g implements VEListener.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125941a;

        static {
            Covode.recordClassIndex(82748);
        }

        g(e eVar) {
            this.f125941a = eVar;
        }

        @Override // com.ss.android.vesdk.VEListener.i
        public final void a(float f2) {
            Message obtain = Message.obtain();
            obtain.what = 1002;
            obtain.obj = Float.valueOf(f2);
            this.f125941a.f125934j.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar = this.f125935l;
        if (aVar != null && aVar.isShowing()) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar2 = this.f125935l;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.a(i2);
        }
    }

    public final void a(Activity activity) {
        this.f125936m = activity;
        if (activity != null && !activity.isFinishing()) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a(activity);
            this.f125935l = aVar;
            aVar.a(true);
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar2 = this.f125935l;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.setCancelable(true);
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar3 = this.f125935l;
            if (aVar3 == null) {
                l.b();
            }
            aVar3.setMessage(activity.getResources().getString(R.string.g7q));
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar4 = this.f125935l;
            if (aVar4 == null) {
                l.b();
            }
            aVar4.a(0);
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar5 = this.f125935l;
            if (aVar5 == null) {
                l.b();
            }
            aVar5.setOnDismissListener(new c(this));
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a aVar6 = this.f125935l;
            if (aVar6 == null) {
                l.b();
            }
            aVar6.a(new d(this));
        }
    }

    public final void a(List<? extends VideoSegment> list) {
        this.n = false;
        b bVar = this.f125930f;
        if (bVar != null) {
            bVar.a();
        }
        if (k.a(list)) {
            a(true, false, false);
        } else if (this.f125925a == null) {
            a(false, false, false);
        } else {
            b();
            this.n = false;
            this.f125932h = 0.0f;
            if (list == null) {
                l.b();
            }
            this.f125931g = 1.0f / ((float) list.size());
            this.f125926b = 0;
            this.f125929e = list;
            VideoSegment videoSegment = (VideoSegment) list.get(0);
            this.f125927c = videoSegment;
            if (videoSegment == null) {
                l.b();
            }
            this.f125928d = videoSegment.f125477a;
            c();
            a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$e  reason: collision with other inner class name */
    public static final class HandlerC3278e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125939a;

        static {
            Covode.recordClassIndex(82746);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            if (message.what == 1001) {
                e eVar = this.f125939a;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) obj).floatValue();
                if (floatValue >= 1.0f) {
                    if (eVar.f125927c != null) {
                        VideoSegment videoSegment = eVar.f125927c;
                        if (videoSegment == null) {
                            l.b();
                        }
                        videoSegment.p = true;
                        HashSet<String> hashSet = eVar.f125933i;
                        VideoSegment videoSegment2 = eVar.f125927c;
                        if (videoSegment2 == null) {
                            l.b();
                        }
                        hashSet.add(videoSegment2.a(false).toString());
                    }
                    eVar.f125926b++;
                    eVar.f125932h = eVar.f125931g * ((float) eVar.f125926b);
                    int i2 = eVar.f125926b;
                    List<? extends VideoSegment> list = eVar.f125929e;
                    if (list == null) {
                        l.b();
                    }
                    if (i2 >= list.size()) {
                        eVar.a(true, false, true);
                        return;
                    }
                    List<? extends VideoSegment> list2 = eVar.f125929e;
                    if (list2 == null) {
                        l.b();
                    }
                    eVar.f125927c = (VideoSegment) list2.get(eVar.f125926b);
                    if (eVar.f125927c == null) {
                        eVar.a(false, false, false);
                        return;
                    }
                    VideoSegment videoSegment3 = eVar.f125927c;
                    if (videoSegment3 == null) {
                        l.b();
                    }
                    eVar.f125928d = videoSegment3.f125477a;
                    eVar.a();
                    return;
                }
                float f2 = (floatValue * eVar.f125931g) + eVar.f125932h;
                if (eVar.f125930f != null && eVar.f125930f == null) {
                    l.b();
                }
                int i3 = (int) (f2 * 100.0f);
                if (i3 >= 100) {
                    i3 = 100;
                }
                eVar.a(i3);
            } else if (message.what == 1002) {
                e eVar2 = this.f125939a;
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Float");
                if (((Float) obj2).floatValue() >= 1.0f) {
                    if (eVar2.f125927c != null) {
                        VideoSegment videoSegment4 = eVar2.f125927c;
                        if (videoSegment4 == null) {
                            l.b();
                        }
                        videoSegment4.p = true;
                    }
                    eVar2.f125926b++;
                    int i4 = eVar2.f125926b;
                    List<? extends VideoSegment> list3 = eVar2.f125929e;
                    if (list3 == null) {
                        l.b();
                    }
                    if (i4 < list3.size()) {
                        List<? extends VideoSegment> list4 = eVar2.f125929e;
                        if (list4 == null) {
                            l.b();
                        }
                        eVar2.f125927c = (VideoSegment) list4.get(eVar2.f125926b);
                        if (eVar2.f125927c != null) {
                            VideoSegment videoSegment5 = eVar2.f125927c;
                            if (videoSegment5 == null) {
                                l.b();
                            }
                            eVar2.f125928d = videoSegment5.f125477a;
                            com.ss.android.ugc.asve.editor.g gVar = eVar2.f125925a;
                            if (gVar == null) {
                                l.b();
                            }
                            gVar.a(eVar2.f125928d, new g(eVar2));
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC3278e(e eVar, Looper looper) {
            super(looper);
            this.f125939a = eVar;
        }
    }

    public final boolean a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        return this.f125933i.contains(videoSegment.a(false).toString());
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        d();
        b bVar = this.f125930f;
        if (bVar == null) {
            return;
        }
        if (this.n) {
            bVar.a(false, z2, z3);
        } else {
            bVar.a(z, z2, z3);
        }
    }
}
