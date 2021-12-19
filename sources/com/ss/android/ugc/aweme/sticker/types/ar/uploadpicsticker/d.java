package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import h.a.n;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f135985i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f135986a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f135987b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d f135988c;

    /* renamed from: d  reason: collision with root package name */
    public String f135989d;

    /* renamed from: e  reason: collision with root package name */
    String f135990e;

    /* renamed from: f  reason: collision with root package name */
    public final r<String, String, String, Integer, z> f135991f = new e(this);

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.c.a f135992g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f135993h;

    /* renamed from: j  reason: collision with root package name */
    private Handler f135994j;

    /* renamed from: k  reason: collision with root package name */
    private final r<String, String, String, Boolean, z> f135995k = new C3544d(this);

    static {
        Covode.recordClassIndex(88841);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88842);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d dVar = this.f135988c;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final void c() {
        this.f135992g.b();
    }

    public final void b() {
        Handler handler = this.f135994j;
        if (handler == null) {
            l.a("workHandler");
        }
        handler.sendEmptyMessage(1001);
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135997a;

        static {
            Covode.recordClassIndex(88844);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            int i2 = message.what;
            if (i2 == 1001) {
                ArrayList arrayList = new ArrayList();
                if (message.obj != null) {
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    arrayList = (ArrayList) obj;
                }
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d dVar = this.f135997a.f135988c;
                if (dVar != null) {
                    dVar.a(arrayList);
                }
            } else if (i2 == 1002) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.data.UploadPicData");
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a) obj2;
                String str = this.f135997a.f135989d;
                if (str != null && l.a((Object) str, (Object) aVar.f135948f)) {
                    d dVar2 = this.f135997a;
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d dVar3 = dVar2.f135988c;
                    if (dVar3 != null) {
                        dVar3.a(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f135944b) && l.a((Object) aVar.f135944b, (Object) dVar2.f135990e)) {
                        dVar2.a();
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, Looper looper) {
            super(looper);
            this.f135997a = dVar;
        }
    }

    public static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135996a;

        static {
            Covode.recordClassIndex(88843);
        }

        public final void handleMessage(Message message) {
            boolean z;
            Bundle data;
            ArrayList<String> stringArrayList;
            String str;
            l.d(message, "");
            int i2 = message.what;
            if (i2 == 1001) {
                Message obtain = Message.obtain();
                Context context = this.f135996a.f135993h;
                l.d(context, "");
                ArrayList arrayList = new ArrayList();
                List<MediaModel> a2 = com.ss.android.ugc.aweme.mediachoose.helper.a.a(context, false, 100, 0);
                if (k.a(a2)) {
                    arrayList = null;
                } else {
                    for (MediaModel mediaModel : a2) {
                        if (i.a(mediaModel.f109390b) && h.a(mediaModel)) {
                            int i3 = mediaModel.f109400l;
                            int i4 = mediaModel.f109401m;
                            if (i3 <= 0 || i4 <= 0) {
                                int[] a3 = com.ss.android.ugc.tools.utils.c.a(mediaModel.f109390b);
                                i3 = a3[0];
                                i4 = a3[1];
                            }
                            float f2 = (float) i3;
                            float f3 = (float) i4;
                            if (f2 > f3 * 2.5f || f3 > f2 * 2.5f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 >= 360 && i4 >= 480 && !z) {
                                arrayList.add(mediaModel.f109390b);
                            }
                        }
                    }
                }
                obtain.obj = arrayList;
                obtain.what = 1001;
                Handler handler = this.f135996a.f135987b;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
            } else if (i2 == 1004 && (stringArrayList = (data = message.getData()).getStringArrayList("img_list")) != null) {
                l.b(stringArrayList, "");
                EffectSdkExtra effectSdkExtra = (EffectSdkExtra) data.getParcelable("effect_sdk_extra");
                if (effectSdkExtra != null) {
                    l.b(effectSdkExtra, "");
                    if (!(stringArrayList.isEmpty() || effectSdkExtra.getPl().getAlg().isEmpty() || (str = this.f135996a.f135989d) == null)) {
                        this.f135996a.f135992g.a(str, stringArrayList, effectSdkExtra, this.f135996a.f135991f);
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Looper looper) {
            super(looper);
            this.f135996a = dVar;
        }
    }

    public d(com.ss.android.ugc.aweme.sticker.c.a aVar, Context context) {
        l.d(aVar, "");
        l.d(context, "");
        this.f135992g = aVar;
        this.f135993h = context;
        HandlerThread handlerThread = new HandlerThread("pixaloop_work");
        this.f135986a = handlerThread;
        handlerThread.start();
        this.f135994j = new b(this, handlerThread.getLooper());
        this.f135987b = new c(this, Looper.getMainLooper());
    }

    public final void a(List<String> list, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
        l.d(list, "");
        l.d(aVar, "");
        if (list.isEmpty() || aVar.b().isEmpty()) {
            a();
            return;
        }
        this.f135990e = null;
        Handler handler = this.f135987b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f135994j;
        if (handler2 == null) {
            l.a("workHandler");
        }
        handler2.removeCallbacksAndMessages(null);
        this.f135990e = (String) n.i((List) list);
        this.f135989d = aVar.f135948f;
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("img_list", (ArrayList) list);
        bundle.putParcelable("effect_sdk_extra", aVar.f135949g);
        l.b(obtain, "");
        obtain.setData(bundle);
        obtain.what = 1004;
        Handler handler3 = this.f135994j;
        if (handler3 == null) {
            l.a("workHandler");
        }
        handler3.sendMessage(obtain);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$d  reason: collision with other inner class name */
    static final class C3544d extends m implements r<String, String, String, Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3544d(d dVar) {
            super(4);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(String str, String str2, String str3, Boolean bool) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean booleanValue = bool.booleanValue();
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            Message obtain = Message.obtain();
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(str5, str6, booleanValue);
            aVar.f135948f = str4;
            obtain.obj = aVar;
            obtain.what = 1002;
            Handler handler = this.this$0.f135987b;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements r<String, String, String, Integer, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(4);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(String str, String str2, String str3, Integer num) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int intValue = num.intValue();
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            Message obtain = Message.obtain();
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(str5, str6, intValue);
            aVar.f135948f = str4;
            obtain.obj = aVar;
            obtain.what = 1002;
            Handler handler = this.this$0.f135987b;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            return z.f158842a;
        }
    }
}
