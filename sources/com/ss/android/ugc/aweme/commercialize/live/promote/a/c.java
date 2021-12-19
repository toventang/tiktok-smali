package com.ss.android.ugc.aweme.commercialize.live.promote.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;

public final class c extends a<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f74680d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final Context f74681c;

    /* renamed from: e  reason: collision with root package name */
    private IIconSlot.SlotViewModel f74682e;

    /* renamed from: f  reason: collision with root package name */
    private final b f74683f = new b(new b(this));

    /* renamed from: g  reason: collision with root package name */
    private ab.a f74684g;

    static {
        Covode.recordClassIndex(46045);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "promote";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46046);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_BROADCAST_PREVIEW_PROMOTE;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f74683f;
    }

    public c(Context context) {
        l.d(context, "");
        this.f74681c = context;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, ? extends Object> map, ab.b bVar) {
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_broadcast_preview_promote_bool");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        bVar.a(l.a(obj, (Object) true));
    }

    static final class b implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74685a;

        static {
            Covode.recordClassIndex(46047);
        }

        b(c cVar) {
            this.f74685a = cVar;
        }

        @Override // com.bytedance.android.live.slot.ae
        public final void a(View view, String str) {
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                ((PromoteEntryCheckApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(PromoteEntryCheckApi.class, com.ss.android.ugc.aweme.commercialize.util.c.f75475a)).getPromoteEntryCheck("", "before_live").a(new f(this, "before_live") {
                    /* class com.ss.android.ugc.aweme.commercialize.live.promote.a.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f74686a;

                    static {
                        Covode.recordClassIndex(46048);
                    }

                    {
                        this.f74686a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
                        if (r10 != null) goto L_0x0066;
                     */
                    @Override // f.a.d.f
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void accept(java.lang.Object r10) {
                        /*
                        // Method dump skipped, instructions count: 239
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.promote.a.c.b.AnonymousClass1.accept(java.lang.Object):void");
                    }
                }, new f(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.live.promote.a.c.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f74688a;

                    static {
                        Covode.recordClassIndex(46049);
                    }

                    {
                        this.f74688a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        String str;
                        Resources resources;
                        Context context = this.f74688a.f74685a.f74681c;
                        if (context == null || (resources = context.getResources()) == null) {
                            str = null;
                        } else {
                            str = resources.getString(R.string.de2);
                        }
                        ao.a(str);
                    }
                });
                r.a("Promote_live_entrance_click", new d().a("user_id", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a()).a("promote_version", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.b()).a("user_account_type", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.c()).a("entrance_type", "go_live").f66730a);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(ac acVar, ab.a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        l.d(slotViewModel, "");
        l.d(aVar, "");
        this.f74682e = slotViewModel;
        this.f74684g = aVar;
        if (slotViewModel != null) {
            l.d(slotViewModel, "");
            t<Boolean> tVar = slotViewModel.f12714b;
            l.b(tVar, "");
            Looper mainLooper = Looper.getMainLooper();
            l.b(mainLooper, "");
            if (mainLooper.getThread() == Thread.currentThread()) {
                tVar.setValue(true);
            } else {
                tVar.postValue(true);
            }
            t<Drawable> tVar2 = slotViewModel.f12717e;
            l.b(tVar2, "");
            tVar2.setValue(androidx.core.content.b.a(this.f74681c, 2131232674));
            t<String> tVar3 = slotViewModel.f12721i;
            l.b(tVar3, "");
            tVar3.setValue(this.f74681c.getString(R.string.ezn));
            com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a(this.f74681c);
        }
        r.a("Promote_live_entrance_show", new d().a("user_id", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a()).a("promote_version", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.b()).a("user_account_type", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.c()).a("entrance_type", "go_live").f66730a);
    }
}
