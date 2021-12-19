package com.ss.android.ugc.aweme.comment.barrage.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.a.d;
import com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.p;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import i.a.a.a.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class CommentBubbleMultiAnchorView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public BubbleMultiTagLayout f71687a;

    /* renamed from: b  reason: collision with root package name */
    private String f71688b;

    static final class a<T> implements s {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71689a = new a();

        static {
            Covode.recordClassIndex(44096);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.feed.i.s
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(44095);
    }

    public CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final String getMEventType() {
        return this.f71688b;
    }

    /* access modifiers changed from: protected */
    public final void setMEventType(String str) {
        this.f71688b = str;
    }

    public final void a(Aweme aweme) {
        l.d(aweme, "");
        this.f71687a.setRootBackgroundDrawable(null);
        this.f71687a.setOnInternalEventListener(a.f71689a);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) anchors, 10));
            for (T t : anchors) {
                int type = t.getType();
                Map map = (Map) d.f71272b.getValue();
                UrlModel urlModel = map != null ? (UrlModel) map.get(Integer.valueOf(type)) : null;
                t.setNewStyleBubbleIcon(urlModel);
                arrayList.add(urlModel);
            }
        }
        BubbleMultiTagLayout bubbleMultiTagLayout = this.f71687a;
        Activity activity = (Activity) getContext();
        if (activity == null) {
            l.b();
        }
        JSONObject jSONObject = new JSONObject();
        l.d(aweme, "");
        l.d(activity, "");
        l.d("personal_homepage", "");
        l.d(jSONObject, "");
        if (bubbleMultiTagLayout.f71680a.a(aweme, activity, "personal_homepage", jSONObject, bubbleMultiTagLayout.f71681b, true, bubbleMultiTagLayout) == 0) {
            b.a(this);
            this.f71687a.c();
            return;
        }
        b.c(this);
        BubbleMultiTagLayout bubbleMultiTagLayout2 = this.f71687a;
        if (com.ss.android.ugc.aweme.feed.assem.a.f91966a) {
            p.a().post(new BubbleMultiTagLayout.a(bubbleMultiTagLayout2));
            p.a().post(new BubbleMultiTagLayout.b(bubbleMultiTagLayout2));
            p.a().post(new BubbleMultiTagLayout.c(bubbleMultiTagLayout2));
            return;
        }
        bubbleMultiTagLayout2.a();
        bubbleMultiTagLayout2.c();
        if (bubbleMultiTagLayout2.f71680a.a()) {
            bubbleMultiTagLayout2.setVisibility(0);
            bubbleMultiTagLayout2.f71680a.b(bubbleMultiTagLayout2);
        }
    }

    private /* synthetic */ CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(898);
        FrameLayout.inflate(context, R.layout.i3, this);
        View findViewById = findViewById(R.id.a9y);
        l.b(findViewById, "");
        this.f71687a = (BubbleMultiTagLayout) findViewById;
        MethodCollector.o(898);
    }
}
