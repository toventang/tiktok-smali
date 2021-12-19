package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class r implements IFetchCategoryEffectListener {

    /* renamed from: f  reason: collision with root package name */
    public static final a f89072f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f89073a;

    /* renamed from: b  reason: collision with root package name */
    public final String f89074b;

    /* renamed from: c  reason: collision with root package name */
    public final int f89075c;

    /* renamed from: d  reason: collision with root package name */
    public final int f89076d;

    /* renamed from: e  reason: collision with root package name */
    public final IFetchCategoryEffectListener f89077e;

    /* renamed from: g  reason: collision with root package name */
    private final o f89078g;

    static {
        Covode.recordClassIndex(56017);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56018);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static r a(String str, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            l.d(str, "");
            l.d(iFetchCategoryEffectListener, "");
            return new r(str, i2, i3, new i(str, iFetchCategoryEffectListener), (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        Object obj;
        int i2;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
            l.b(msg, "");
        }
        ap I = g.a().I();
        ar a2 = new ar().a("errorCode", Integer.valueOf(errorCode)).a("errorDesc", msg).a("count", Integer.valueOf(this.f89075c)).a("cursor", Integer.valueOf(this.f89076d)).a("panel", this.f89074b);
        Map<String, ? extends Object> map = this.f89073a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        I.a("sticker_list_error_rate", 1, a2.a("is_story", Integer.valueOf(i2)).a());
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f89077e;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
        Object obj;
        int i2;
        long a2 = this.f89078g.a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f89077e;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        ar a3 = new ar().a("duration", Long.valueOf(a2)).a("abParam", (Integer) 2).a("count", Integer.valueOf(this.f89075c)).a("cursor", Integer.valueOf(this.f89076d)).a("panel", this.f89074b);
        Map<String, ? extends Object> map = this.f89073a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        g.a().I().a("sticker_list_error_rate", 0, a3.a("is_story", Integer.valueOf(i2)).a());
    }

    private r(String str, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.f89074b = str;
        this.f89075c = i2;
        this.f89076d = i3;
        this.f89077e = iFetchCategoryEffectListener;
        o a2 = o.a();
        l.b(a2, "");
        this.f89078g = a2;
    }

    public /* synthetic */ r(String str, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, byte b2) {
        this(str, i2, i3, iFetchCategoryEffectListener);
    }
}
