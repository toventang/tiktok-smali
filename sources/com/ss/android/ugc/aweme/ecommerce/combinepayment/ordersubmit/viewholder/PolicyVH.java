package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class PolicyVH extends JediSimpleViewHolder<e> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final c f85114g = new c((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final View f85115f;

    /* renamed from: j  reason: collision with root package name */
    private final h f85116j;

    static {
        Covode.recordClassIndex(53198);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(53201);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85115f, false);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PolicyVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i f85117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f85119c;

        static {
            Covode.recordClassIndex(53200);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f85118b.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            boolean z;
            l.d(view, "");
            IBulletService f2 = BulletService.f();
            Context context = this.f85118b.getContext();
            l.b(context, "");
            String str = this.f85117a.f84967b;
            if (str == null) {
                str = "";
            }
            Boolean bool = this.f85117a.f84968c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("disableBounces", 1);
            if (!z) {
                hashMap.put("__status_bar", true);
                hashMap.put("hide_nav_bar", 1);
                hashMap.put("container_color_auto_dark", 1);
                hashMap.put("should_full_screen", 1);
            } else {
                hashMap.put("use_webview_title", 1);
            }
            String uri = j.a(str, hashMap).build().toString();
            l.b(uri, "");
            f2.a(context, uri);
        }

        b(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i iVar, View view, StringBuilder sb) {
            this.f85117a = iVar;
            this.f85118b = view;
            this.f85119c = sb;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolicyVH(View view) {
        super(view);
        l.d(view, "");
        this.f85115f = view;
        h.k.c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85116j = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(e eVar) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.h privacyPolicyStatement;
        String str;
        int i2;
        String str2;
        e eVar2 = eVar;
        l.d(eVar2, "");
        View view = this.f85115f;
        BillInfoData billInfoData = ((OrderSubmitViewModel) this.f85116j.getValue()).f84735k;
        if (!(billInfoData == null || (privacyPolicyStatement = billInfoData.getPrivacyPolicyStatement()) == null || (str = privacyPolicyStatement.f84964a) == null)) {
            StringBuilder sb = new StringBuilder(str);
            HashMap<String, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i> hashMap = privacyPolicyStatement.f84965b;
            int i3 = 0;
            if (hashMap != null) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : hashMap.keySet()) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i iVar = hashMap.get(str3);
                    if (!(iVar == null || (str2 = iVar.f84966a) == null)) {
                        arrayList.add(iVar);
                        int indexOf = sb.indexOf(str3);
                        sb.replace(indexOf, str3.length() + indexOf, str2);
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i iVar2 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i) it.next();
                    int indexOf2 = sb.indexOf(iVar2.f84966a);
                    String str4 = iVar2.f84966a;
                    if (str4 != null) {
                        i2 = str4.length();
                    } else {
                        i2 = 0;
                    }
                    int i4 = i2 + indexOf2;
                    if (indexOf2 >= 0 && i4 < sb.length()) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf2, i4, 17);
                        spannableStringBuilder.setSpan(new b(iVar2, view, sb), indexOf2, i4, 17);
                    }
                }
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.d6i);
                l.b(tuxTextView, "");
                tuxTextView.setText(spannableStringBuilder);
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d6i);
                l.b(tuxTextView2, "");
                tuxTextView2.setClickable(true);
                TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.d6i);
                l.b(tuxTextView3, "");
                tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (!eVar2.f84824a) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }
}
