package com.ss.android.ugc.aweme.i18n.xbridge.d.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.e;
import com.ss.android.ugc.aweme.ce.b;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class d implements com.ss.android.ugc.aweme.i18n.xbridge.a.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f100043e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final WeakReference<Activity> f100044a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.i18n.xbridge.a.b f100045b;

    /* renamed from: c  reason: collision with root package name */
    boolean f100046c;

    /* renamed from: d  reason: collision with root package name */
    String f100047d;

    static {
        Covode.recordClassIndex(63756);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63757);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.ies.xbridge.base.runtime.a.d $params;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(63758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, com.bytedance.ies.xbridge.base.runtime.a.d dVar2) {
            super(0);
            this.this$0 = dVar;
            this.$params = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Uri a2;
            d dVar = this.this$0;
            String str = this.$params.f35796j;
            Activity activity = dVar.f100044a.get();
            if (activity == null) {
                dVar.f100045b.a(0, "Activity obtained is null");
            } else {
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                if (l.a((Object) str, (Object) "front")) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                    intent.putExtra("default_camera", "1");
                    intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                    intent.putExtra("camerafacing", "front");
                    intent.putExtra("previous_mode", "front");
                }
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date())));
                if (dVar.f100046c) {
                    a2 = e.b(activity, concat + ".mp4", "video/mp4");
                    l.b(a2, "");
                } else {
                    File createTempFile = File.createTempFile(concat, ".mp4", com.ss.android.ugc.aweme.i18n.xbridge.d.a.a());
                    l.b(createTempFile, "");
                    dVar.f100047d = createTempFile.getAbsolutePath();
                    a2 = com.ss.android.newmedia.d.a(activity, createTempFile);
                    l.b(a2, "");
                }
                intent.putExtra("output", a2);
                activity.startActivityForResult(intent, 800);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final void a(com.bytedance.ies.xbridge.base.runtime.a.d dVar) {
        l.d(dVar, "");
        this.f100046c = dVar.f35795i;
        b bVar = new b(this, dVar);
        l.d(bVar, "");
        Activity activity = this.f100044a.get();
        if (activity == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.utils.permission.e.a(activity) == 0 && com.ss.android.ugc.aweme.utils.permission.e.c(activity) == 0) {
            bVar.invoke();
        } else {
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new c(this, bVar));
        }
    }

    public d(WeakReference<Activity> weakReference, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar) {
        l.d(weakReference, "");
        l.d(bVar, "");
        this.f100044a = weakReference;
        this.f100045b = bVar;
    }

    static final class c implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f100048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f100049b;

        static {
            Covode.recordClassIndex(63759);
        }

        c(d dVar, h.f.a.a aVar) {
            this.f100048a = dVar;
            this.f100049b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f100049b.invoke();
            } else {
                this.f100048a.f100045b.a(-6, "Permission rejected");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final boolean a(int i2, int i3, Intent intent) {
        if (i2 == 800) {
            if (i3 == 0 || intent == null) {
                this.f100045b.a(-7, "Failed to capture video");
                return true;
            }
            Activity activity = this.f100044a.get();
            if (activity == null) {
                this.f100045b.a(0, "Activity not found");
                return true;
            }
            Uri data = intent.getData();
            if (data == null || com.bytedance.common.utility.m.a(data.toString())) {
                this.f100045b.a(0, "Video doesn't exist");
                return true;
            }
            String str = this.f100047d;
            if (str == null) {
                str = data.toString();
                l.b(str, "");
            }
            List<e.a> a2 = n.a(new e.a(str, c.b.e.a(activity, data), "video"));
            com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f100045b;
            com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
            eVar.f35800a = a2;
            bVar.a(eVar);
        }
        return true;
    }
}
