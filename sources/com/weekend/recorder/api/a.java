package com.weekend.recorder.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.weekend.recorder.api.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.w;

public final class a implements IAutoRecorder {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f156391a = {new y(ab.a(a.class), "recorder", "getRecorder()Lcom/weekend/recorder/api/IAutoRecorder;")};

    /* renamed from: b  reason: collision with root package name */
    public static final a f156392b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f156393c = h.i.a((h.f.a.a) C4128a.f156394a);

    private static IAutoRecorder a() {
        return (IAutoRecorder) f156393c.getValue();
    }

    private a() {
    }

    /* renamed from: com.weekend.recorder.api.a$a  reason: collision with other inner class name */
    static final class C4128a extends m implements h.f.a.a<IAutoRecorder> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4128a f156394a = new C4128a();

        static {
            Covode.recordClassIndex(103864);
        }

        C4128a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAutoRecorder invoke() {
            return a();
        }

        private static IAutoRecorder a() {
            try {
                Object newInstance = Class.forName("com.weekend.recorder.RecorderWrapper").newInstance();
                if (newInstance != null) {
                    return (IAutoRecorder) newInstance;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(103863);
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final boolean getWeekEndRecorderSwitch(Context context) {
        l.c(context, "");
        IAutoRecorder a2 = a();
        if (a2 == null || !a2.getWeekEndRecorderSwitch(context)) {
            return false;
        }
        return true;
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void switchEnable(Context context, boolean z) {
        l.c(context, "");
        IAutoRecorder a2 = a();
        if (a2 != null) {
            a2.switchEnable(context, z);
        }
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void init(String str, String str2, b bVar, com.weekend.recorder.api.a.a aVar) {
        l.c(str, "");
        l.c(str2, "");
        l.c(bVar, "");
        l.c(aVar, "");
        IAutoRecorder a2 = a();
        if (a2 != null) {
            a2.init(str, str2, bVar, aVar);
        }
    }
}
