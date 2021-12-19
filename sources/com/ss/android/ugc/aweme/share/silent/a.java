package com.ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.silent.c;
import com.ss.android.ugc.aweme.share.silent.t;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final C3239a f124281f = new C3239a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Context f124282a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f124283b;

    /* renamed from: c  reason: collision with root package name */
    public SilentSharePopupWindow f124284c;

    /* renamed from: d  reason: collision with root package name */
    int f124285d = 2;

    /* renamed from: e  reason: collision with root package name */
    public int f124286e = -1;

    /* renamed from: i  reason: collision with root package name */
    private final h f124287i = i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private int f124288j;

    /* renamed from: k  reason: collision with root package name */
    private final List<p<c, CanCancelRadioButton>> f124289k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private TextView f124290l;

    /* renamed from: m  reason: collision with root package name */
    private String f124291m = "";
    private int n = 44;
    private int o = 30;

    static {
        Covode.recordClassIndex(81612);
    }

    public abstract void a();

    public void a(View view) {
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(CanCancelRadioButton.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(boolean z) {
    }

    public abstract int getLayoutResId();

    /* access modifiers changed from: protected */
    public final RadioGroup getRadioGroup() {
        return (RadioGroup) this.f124287i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSaveLocalEnabled(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a$a  reason: collision with other inner class name */
    public static final class C3239a {
        static {
            Covode.recordClassIndex(81613);
        }

        private C3239a() {
        }

        public /* synthetic */ C3239a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final List<p<c, CanCancelRadioButton>> getButtonPairList() {
        return this.f124289k;
    }

    /* access modifiers changed from: protected */
    public final TextView getSyncTitle() {
        return this.f124290l;
    }

    static final class d extends m implements h.f.a.a<RadioGroup> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(81616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RadioGroup invoke() {
            return this.this$0.findViewById(R.id.dgr);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final String c() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return com.ss.android.ugc.aweme.share.silent.b.a.a(";", arrayList);
    }

    private void e() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (!(!c.a.a((Activity) context).isEmpty())) {
            setVisibility(8);
            TextView textView = this.f124290l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            getRadioGroup().setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public int getSaveUploadType() {
        for (p<c, CanCancelRadioButton> pVar : this.f124289k) {
            if (pVar.getSecond().getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return pVar.getFirst().getSaveType();
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            List<c> a2 = c.a.a((Activity) context);
            if (a2.isEmpty()) {
                e();
                return;
            }
            for (c cVar : n.d((Iterable) a2, 4)) {
                View a3 = com.a.a(LayoutInflater.from(getContext()), R.layout.azq, getRadioGroup(), false);
                Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton");
                CanCancelRadioButton canCancelRadioButton = (CanCancelRadioButton) a3;
                canCancelRadioButton.setTag(cVar);
                Context context2 = getContext();
                l.b(context2, "");
                canCancelRadioButton.setBackground(t.a.a(context2, cVar.getUncheckedIconRes(), cVar.getCheckedIconRes(), this.n, this.o));
                canCancelRadioButton.setId(View.generateViewId());
                a((View) canCancelRadioButton);
                canCancelRadioButton.setOnClickListener(new b(this));
                getRadioGroup().addView(canCancelRadioButton);
                this.f124289k.add(new p<>(cVar, canCancelRadioButton));
            }
            int a4 = com.ss.android.ugc.aweme.base.h.d.a().a("key_silent_share_save", 0);
            for (p<c, CanCancelRadioButton> pVar : this.f124289k) {
                if (pVar.getFirst().getSaveType() == a4) {
                    pVar.getSecond().setChecked(true);
                    this.f124286e = pVar.getSecond().getId();
                }
            }
            getRadioGroup().setOnCheckedChangeListener(new c(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void setSyncTitle(TextView textView) {
        this.f124290l = textView;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTextColor(int i2) {
        TextView textView = this.f124290l;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTextSize(float f2) {
        TextView textView = this.f124290l;
        if (textView != null) {
            textView.setTextSize(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.f124290l;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public static final /* synthetic */ SilentSharePopupWindow a(a aVar) {
        SilentSharePopupWindow silentSharePopupWindow = aVar.f124284c;
        if (silentSharePopupWindow == null) {
            l.a("popupWindow");
        }
        return silentSharePopupWindow;
    }

    private static String a(Object obj) {
        String obj2;
        if (obj == null || (obj2 = obj.toString()) == null) {
            return "";
        }
        return obj2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124292a;

        static {
            Covode.recordClassIndex(81614);
        }

        b(a aVar) {
            this.f124292a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Boolean> isAwemePrivate = inst.getIsAwemePrivate();
            l.b(isAwemePrivate, "");
            Boolean c2 = isAwemePrivate.c();
            l.b(c2, "");
            if (c2.booleanValue()) {
                l.b(view, "");
                new com.bytedance.tux.g.b(view).a(this.f124292a.getContext().getString(R.string.evw)).b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), getLayoutResId(), this, true);
        this.f124282a = context;
        a();
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncIconSize(int i2) {
        for (p<c, CanCancelRadioButton> pVar : this.f124289k) {
            ViewGroup.LayoutParams layoutParams = pVar.getSecond().getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(int i2) {
        boolean z;
        int i3 = 0;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f124288j = i2;
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Boolean> isAwemePrivate = inst.getIsAwemePrivate();
        l.b(isAwemePrivate, "");
        isAwemePrivate.b(Boolean.valueOf(z));
        ShareDependService a2 = ShareDependService.a.a();
        Context context = getContext();
        l.b(context, "");
        a2.a(context, z);
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            for (p<c, CanCancelRadioButton> pVar : this.f124289k) {
                pVar.getSecond().setCanChecked(false);
            }
        } else {
            for (p<c, CanCancelRadioButton> pVar2 : this.f124289k) {
                pVar2.getSecond().setCanChecked(true);
            }
        }
        TextView textView = this.f124290l;
        if (textView != null) {
            if (z) {
                i3 = 8;
            }
            textView.setVisibility(i3);
        }
        e();
    }

    public final void a(int i2, int i3) {
        this.n = i2;
        this.o = i3;
    }

    static final class c implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124298a;

        static {
            Covode.recordClassIndex(81615);
        }

        c(a aVar) {
            this.f124298a = aVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
            int width;
            a aVar = this.f124298a;
            if (aVar.f124286e != i2) {
                byte b2 = 0;
                if (i2 == -1) {
                    com.ss.android.ugc.aweme.base.h.d.a().b("key_silent_share_save", 0);
                }
                int i3 = 1;
                if (!aVar.f124283b) {
                    aVar.f124283b = true;
                    AVExternalServiceImpl.a().publishService().cancelSynthesis(aVar.getContext(), "base_sync_share_view_v2");
                }
                if (aVar.f124284c != null && a.a(aVar).isShowing()) {
                    a.a(aVar).dismiss();
                }
                for (p<c, CanCancelRadioButton> pVar : aVar.getButtonPairList()) {
                    if (pVar.getSecond().getId() == i2) {
                        com.ss.android.ugc.aweme.base.h.d.a().b("key_silent_share_save", pVar.getFirst().getSaveType());
                        CanCancelRadioButton second = pVar.getSecond();
                        String label = pVar.getFirst().getLabel();
                        l.d(second, "");
                        l.d(label, "");
                        if (com.ss.android.ugc.aweme.base.h.d.a().a("key_pop_up_window_share_count", (int) b2) < 3 && aVar.f124285d > 0) {
                            aVar.f124285d -= i3;
                            if (aVar.f124284c != null) {
                                SilentSharePopupWindow silentSharePopupWindow = aVar.f124284c;
                                if (silentSharePopupWindow == null) {
                                    l.a("popupWindow");
                                }
                                if (silentSharePopupWindow.isShowing()) {
                                    SilentSharePopupWindow silentSharePopupWindow2 = aVar.f124284c;
                                    if (silentSharePopupWindow2 == null) {
                                        l.a("popupWindow");
                                    }
                                    silentSharePopupWindow2.dismiss();
                                }
                            }
                            Context context = aVar.getContext();
                            l.b(context, "");
                            Resources resources = aVar.getResources();
                            Object[] objArr = new Object[i3];
                            objArr[b2] = label;
                            String string = resources.getString(R.string.fak, objArr);
                            l.b(string, "");
                            aVar.f124284c = new SilentSharePopupWindow(context, string, (int) com.bytedance.common.utility.n.b(aVar.getContext(), 3.0f), b2);
                            SilentSharePopupWindow silentSharePopupWindow3 = aVar.f124284c;
                            if (silentSharePopupWindow3 == null) {
                                l.a("popupWindow");
                            }
                            silentSharePopupWindow3.getContentView().measure(b2, b2);
                            float b3 = com.bytedance.common.utility.n.b(aVar.getContext(), 10.0f);
                            SilentSharePopupWindow silentSharePopupWindow4 = aVar.f124284c;
                            if (silentSharePopupWindow4 == null) {
                                l.a("popupWindow");
                            }
                            View contentView = silentSharePopupWindow4.getContentView();
                            l.b(contentView, "");
                            int measuredWidth = contentView.getMeasuredWidth();
                            SilentSharePopupWindow silentSharePopupWindow5 = aVar.f124284c;
                            if (silentSharePopupWindow5 == null) {
                                l.a("popupWindow");
                            }
                            View contentView2 = silentSharePopupWindow5.getContentView();
                            l.b(contentView2, "");
                            int measuredHeight = contentView2.getMeasuredHeight();
                            SilentSharePopupWindow silentSharePopupWindow6 = aVar.f124284c;
                            if (silentSharePopupWindow6 == null) {
                                l.a("popupWindow");
                            }
                            ImageView imageView = (ImageView) silentSharePopupWindow6.getContentView().findViewById(R.id.bu8);
                            SilentSharePopupWindow silentSharePopupWindow7 = aVar.f124284c;
                            if (silentSharePopupWindow7 == null) {
                                l.a("popupWindow");
                            }
                            ImageView imageView2 = (ImageView) silentSharePopupWindow7.getContentView().findViewById(R.id.bu9);
                            if (UIUXBugsExperimentService.b().a()) {
                                imageView.setColorFilter(androidx.core.content.b.c(aVar.getContext(), R.color.bm));
                                imageView2.setColorFilter(androidx.core.content.b.c(aVar.getContext(), R.color.bm));
                            }
                            int[] iArr = new int[2];
                            second.getLocationOnScreen(iArr);
                            int a2 = com.bytedance.common.utility.n.a(aVar.f124282a);
                            int width2 = iArr[b2] + (second.getWidth() / 2);
                            int i4 = measuredWidth / 2;
                            float f2 = (float) width2;
                            if (((float) i4) + b3 > f2) {
                                width = (int) (b3 - ((float) iArr[0]));
                                l.b(imageView, "");
                                imageView.getLayoutParams().width = (int) (f2 - b3);
                                l.b(imageView2, "");
                                imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
                            } else {
                                float f3 = ((float) a2) - b3;
                                if (((float) (width2 + i4)) > f3) {
                                    width = (int) (f3 - ((float) (iArr[0] + measuredWidth)));
                                    l.b(imageView2, "");
                                    imageView2.getLayoutParams().width = (int) (f3 - f2);
                                    l.b(imageView, "");
                                    imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
                                } else {
                                    width = (second.getWidth() - measuredWidth) / 2;
                                    l.b(imageView, "");
                                    imageView.getLayoutParams().width = i4;
                                    l.b(imageView2, "");
                                    imageView2.getLayoutParams().width = i4;
                                }
                            }
                            imageView.getLayoutParams().height = measuredHeight;
                            imageView2.getLayoutParams().height = measuredHeight;
                            SilentSharePopupWindow silentSharePopupWindow8 = aVar.f124284c;
                            if (silentSharePopupWindow8 == null) {
                                l.a("popupWindow");
                            }
                            silentSharePopupWindow8.getContentView().measure(0, 0);
                            View contentView3 = silentSharePopupWindow8.getContentView();
                            l.b(contentView3, "");
                            silentSharePopupWindow8.f124274c = contentView3.getMeasuredHeight();
                            View contentView4 = silentSharePopupWindow8.getContentView();
                            l.b(contentView4, "");
                            silentSharePopupWindow8.f124273b = contentView4.getMeasuredWidth();
                            try {
                                SilentSharePopupWindow silentSharePopupWindow9 = aVar.f124284c;
                                if (silentSharePopupWindow9 == null) {
                                    l.a("popupWindow");
                                }
                                if (!(silentSharePopupWindow9.f124275d instanceof Activity) || !((Activity) silentSharePopupWindow9.f124275d).isFinishing()) {
                                    int i5 = Build.VERSION.SDK_INT;
                                    silentSharePopupWindow9.showAsDropDown(second, width, -(second.getHeight() + silentSharePopupWindow9.f124274c + silentSharePopupWindow9.f124276e), 51);
                                    silentSharePopupWindow9.getContentView().removeCallbacks(silentSharePopupWindow9.f124272a);
                                    silentSharePopupWindow9.getContentView().postDelayed(silentSharePopupWindow9.f124272a, 5000);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        aVar.a(true, pVar.getFirst().getKey());
                    }
                    if (pVar.getSecond().getId() == aVar.f124286e) {
                        aVar.a(false, pVar.getFirst().getKey());
                    }
                    b2 = 0;
                    i3 = 1;
                }
                aVar.f124286e = i2;
            }
        }
    }

    public final void a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (!(tag instanceof Map)) {
            tag = null;
        }
        Map map = (Map) tag;
        if (map != null) {
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            r.a(str2, new com.ss.android.ugc.aweme.app.f.d().a("creation_id", a(map.get("creation_id"))).a("enter_from", a(map.get("enter_from"))).a("content_type", a(map.get("content_type"))).a("shoot_way", a(map.get("shoot_way"))).a("share_to", str).f66730a);
            if (z) {
                d();
            }
        }
    }
}
