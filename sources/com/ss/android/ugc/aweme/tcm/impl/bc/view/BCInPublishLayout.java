package com.ss.android.ugc.aweme.tcm.impl.bc.view;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.tcm.api.b.a;
import com.ss.android.ugc.aweme.tcm.api.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;

public final class BCInPublishLayout extends FrameLayout implements a.AbstractC3653a, c.b {

    /* renamed from: a  reason: collision with root package name */
    ax.a f138593a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f138594b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f138595c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f138596d;

    /* renamed from: e  reason: collision with root package name */
    private String f138597e;

    /* renamed from: f  reason: collision with root package name */
    private TagBAUser f138598f;

    /* renamed from: g  reason: collision with root package name */
    private TagBAUser f138599g;

    /* renamed from: h  reason: collision with root package name */
    private String f138600h;

    /* renamed from: i  reason: collision with root package name */
    private String f138601i;

    /* renamed from: j  reason: collision with root package name */
    private String f138602j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f138603k;

    static {
        Covode.recordClassIndex(90674);
    }

    public BCInPublishLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a() {
        if (this.f138603k == null) {
            this.f138603k = new HashMap();
        }
        View view = (View) this.f138603k.get(Integer.valueOf((int) R.id.wq));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.wq);
        this.f138603k.put(Integer.valueOf((int) R.id.wq), findViewById);
        return findViewById;
    }

    public final String getBc() {
        return this.f138600h;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final String getBcStarAtlasContent() {
        return this.f138597e;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final String getBcType() {
        return this.f138602j;
    }

    public final String getBrandedContentType() {
        return this.f138601i;
    }

    public final boolean getHasBrandedContentTool() {
        return this.f138595c;
    }

    public final boolean getMusicUsageOrigin() {
        return this.f138596d;
    }

    public final ax.a getPublishExtensionDataContainer() {
        return this.f138593a;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final TagBAUser getShouldBeDetag() {
        return this.f138599g;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final TagBAUser getTagBA() {
        return this.f138598f;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final void setBcStarAtlasContent(String str) {
        this.f138597e = str;
    }

    public final void setCommerceMusic(boolean z) {
        this.f138594b = z;
    }

    public final void setMusicUsageOrigin(boolean z) {
        this.f138596d = z;
    }

    public final void setPublishExtensionDataContainer(ax.a aVar) {
        this.f138593a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final void setShouldBeDetag(TagBAUser tagBAUser) {
        this.f138599g = tagBAUser;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final void setBcType(String str) {
        l.d(str, "");
        this.f138602j = str;
        setBc(getBcType());
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.c.b
    public final void setBrandedContentType(String str) {
        l.d(str, "");
        this.f138601i = str;
        setBc(getBrandedContentType());
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BCInPublishLayout f138604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138605b;

        static {
            Covode.recordClassIndex(90675);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f138604a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f138604a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f138605b).buildUpon().appendQueryParameter("page", "policy").build().toString()).open();
        }

        a(BCInPublishLayout bCInPublishLayout, String str) {
            this.f138604a = bCInPublishLayout;
            this.f138605b = str;
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BCInPublishLayout f138606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138607b;

        static {
            Covode.recordClassIndex(90676);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f138606a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (!TextUtils.isEmpty(this.f138607b)) {
                SmartRouter.buildRoute(this.f138606a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f138607b).buildUpon().appendQueryParameter("page", "policy").build().toString()).open();
            }
        }

        b(BCInPublishLayout bCInPublishLayout, String str) {
            this.f138606a = bCInPublishLayout;
            this.f138607b = str;
        }
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BCInPublishLayout f138608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138609b;

        static {
            Covode.recordClassIndex(90677);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f138608a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            if (this.f138608a.getMusicUsageOrigin()) {
                str = "original";
            } else {
                str = "general";
            }
            if (!TextUtils.isEmpty(this.f138609b)) {
                SmartRouter.buildRoute(this.f138608a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f138609b).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", str).build().toString()).open();
            }
        }

        c(BCInPublishLayout bCInPublishLayout, String str) {
            this.f138608a = bCInPublishLayout;
            this.f138609b = str;
        }
    }

    public final void setBc(String str) {
        l.d(str, "");
        this.f138600h = str;
        if (TextUtils.equals(str, "1") || TextUtils.equals(this.f138600h, "2")) {
            setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) a();
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ax.a aVar = this.f138593a;
            if (aVar != null) {
                aVar.a((Boolean) true);
            }
            setBrandedContent(TextUtils.equals(this.f138600h, "2"));
            return;
        }
        ax.a aVar2 = this.f138593a;
        if (aVar2 != null) {
            aVar2.a((Boolean) false);
        }
        ax.a aVar3 = this.f138593a;
        if (aVar3 != null) {
            aVar3.b(false);
        }
        if (a() != null) {
            TuxTextView tuxTextView2 = (TuxTextView) a();
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.a.AbstractC3653a
    public final void setTagBA(TagBAUser tagBAUser) {
        String str;
        this.f138598f = tagBAUser;
        if (getTagBA() != null) {
            TagBAUser tagBA = getTagBA();
            String str2 = null;
            if (tagBA != null) {
                str = tagBA.getHandleName();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                TagBAUser tagBA2 = getTagBA();
                if (tagBA2 != null) {
                    str2 = tagBA2.getUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    setShouldBeDetag(getTagBA());
                    ax.a aVar = this.f138593a;
                    if (aVar != null) {
                        aVar.a(true, false);
                        return;
                    }
                    return;
                }
            }
        }
        ax.a aVar2 = this.f138593a;
        if (aVar2 != null) {
            aVar2.a(false, Boolean.valueOf(true ^ TextUtils.equals(this.f138600h, "0")));
        }
        setShouldBeDetag(getTagBA());
    }

    private final void setBrandedContent(boolean z) {
        String str;
        String string;
        SpannableString spannableString;
        String string2;
        ax.a aVar = this.f138593a;
        if (aVar != null) {
            aVar.b(true);
        }
        if (a() != null) {
            TuxTextView tuxTextView = (TuxTextView) a();
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            Context context = getContext();
            l.b(context, "");
            String string3 = context.getResources().getString(R.string.a3n);
            l.b(string3, "");
            BrandedContentToolSchema a2 = com.ss.android.ugc.aweme.tcm.impl.d.b.a();
            if (a2 == null || (str = a2.brandedContentPolicy) == null) {
                str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
            }
            if (this.f138594b) {
                if (z) {
                    Context context2 = getContext();
                    l.b(context2, "");
                    string2 = context2.getResources().getString(R.string.a38, string3);
                    l.b(string2, "");
                } else {
                    Context context3 = getContext();
                    l.b(context3, "");
                    string2 = context3.getResources().getString(R.string.r6, string3);
                    l.b(string2, "");
                }
                spannableString = new SpannableString(string2);
                int a3 = p.a((CharSequence) string2, string3, 0, false, 6);
                int length = string3.length() + a3;
                spannableString.setSpan(new StyleSpan(1), a3, length, 33);
                spannableString.setSpan(new a(this, str), a3, length, 33);
            } else {
                Context context4 = getContext();
                l.b(context4, "");
                String string4 = context4.getResources().getString(R.string.a3k);
                l.b(string4, "");
                if (z) {
                    Context context5 = getContext();
                    l.b(context5, "");
                    string = context5.getResources().getString(R.string.a39, string3, string4);
                    l.b(string, "");
                } else {
                    Context context6 = getContext();
                    l.b(context6, "");
                    string = context6.getResources().getString(R.string.r7, string3, string4);
                    l.b(string, "");
                }
                spannableString = new SpannableString(string);
                int a4 = p.a((CharSequence) string, string3, 0, false, 6);
                int length2 = string3.length() + a4;
                int a5 = p.a((CharSequence) string, string4, 0, false, 6);
                int length3 = string4.length() + a5;
                spannableString.setSpan(new StyleSpan(1), a4, length2, 33);
                spannableString.setSpan(new StyleSpan(1), a5, length3, 33);
                spannableString.setSpan(new b(this, str), a4, length2, 33);
                spannableString.setSpan(new c(this, str), a5, length3, 33);
            }
            TuxTextView tuxTextView2 = (TuxTextView) a();
            l.b(tuxTextView2, "");
            tuxTextView2.setMovementMethod(new LinkMovementMethod());
            TuxTextView tuxTextView3 = (TuxTextView) a();
            l.b(tuxTextView3, "");
            tuxTextView3.setText(spannableString);
        }
    }

    private /* synthetic */ BCInPublishLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BCInPublishLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9942);
        this.f138595c = com.ss.android.ugc.aweme.tcm.impl.e.a.a();
        com.a.a(LayoutInflater.from(context), R.layout.lr, this, true);
        com.ss.android.ugc.aweme.tcm.api.b.a.f138554a = this;
        com.ss.android.ugc.aweme.tcm.api.b.c.f138560b = this;
        this.f138600h = "0";
        this.f138601i = "0";
        this.f138602j = "0";
        MethodCollector.o(9942);
    }
}
