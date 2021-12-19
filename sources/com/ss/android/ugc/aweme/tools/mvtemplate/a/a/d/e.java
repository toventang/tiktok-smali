package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;

public final class e extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {

    /* renamed from: d  reason: collision with root package name */
    public String f140699d;

    static {
        Covode.recordClassIndex(91885);
    }

    public static final class a implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f140701b;

        static {
            Covode.recordClassIndex(91886);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            if (!this.f140700a.a(effect, this.f140701b)) {
                this.f140700a.b(this.f140701b);
            }
        }

        a(e eVar, Object obj) {
            this.f140700a = eVar;
            this.f140701b = obj;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f140700a.b(this.f140701b);
        }
    }

    public final void b(Object obj) {
        if (obj instanceof b) {
            ((b) obj).f140674c = !TextUtils.isEmpty(this.f140699d);
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e eVar = this.f140640a;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0 == null) goto L_0x0083;
     */
    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.e.a(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, b bVar) {
        super(bVar);
        l.d(str, "");
        l.d(bVar, "");
        this.f140699d = str;
    }

    public final boolean a(Effect effect, Object obj) {
        if (effect == null) {
            b(obj);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        MvThemeData mvThemeData = new MvThemeData();
        mvThemeData.a(effect);
        arrayList.add(mvThemeData);
        long a2 = this.f140641b.a("fetch mv panel list", "success");
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140733b = (int) a2;
        }
        this.f140642c.f140674c = false;
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e eVar = this.f140640a;
        if (eVar == null) {
            return true;
        }
        eVar.a(arrayList);
        return true;
    }
}
