package com.ss.android.ugc.aweme.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.util.p;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private String f144229a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f144230b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f144231c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f144232d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f144233e;

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f144249a = new e();

        static {
            Covode.recordClassIndex(94399);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(94394);
    }

    private final p getMarqueeHelper() {
        return (p) this.f144233e.getValue();
    }

    public final TextSwitcher getTsMarqueeText() {
        return (TextSwitcher) this.f144231c.getValue();
    }

    public final TextView getTvText() {
        return (TextView) this.f144232d.getValue();
    }

    public final f.a.b.b getD() {
        return this.f144230b;
    }

    public final String getEnterFrom() {
        return this.f144229a;
    }

    static final class h extends m implements h.f.a.a<TextView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.getTsMarqueeText().findViewById(R.id.text);
        }
    }

    static final class b extends m implements h.f.a.a<p> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ p invoke() {
            return new p(this.this$0.getTvText(), this.this$0.getTsMarqueeText());
        }
    }

    static final class g extends m implements h.f.a.a<TextSwitcher> {
        final /* synthetic */ Context $context;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, Context context) {
            super(0);
            this.this$0 = fVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextSwitcher invoke() {
            View findViewById = this.this$0.findViewById(R.id.eri);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextSwitcher");
            TextSwitcher textSwitcher = (TextSwitcher) findViewById;
            textSwitcher.setFactory(new a(textSwitcher, this));
            return textSwitcher;
        }

        static final class a implements ViewSwitcher.ViewFactory {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextSwitcher f144275a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f144276b;

            static {
                Covode.recordClassIndex(94402);
            }

            a(TextSwitcher textSwitcher, g gVar) {
                this.f144275a = textSwitcher;
                this.f144276b = gVar;
            }

            public final View makeView() {
                View a2 = com.a.a(LayoutInflater.from(this.f144276b.$context), R.layout.zb, this.f144275a, false);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.TextView");
                final TextView textView = (TextView) a2;
                this.f144275a.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.view.f.g.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(94403);
                    }

                    public final void run() {
                        int color;
                        int color2;
                        if (gb.a()) {
                            Context context = textView.getContext();
                            l.b(context, "");
                            color = context.getResources().getColor(R.color.ik);
                        } else {
                            Context context2 = textView.getContext();
                            l.b(context2, "");
                            color = context2.getResources().getColor(R.color.il);
                        }
                        if (gb.a()) {
                            Context context3 = textView.getContext();
                            l.b(context3, "");
                            color2 = context3.getResources().getColor(R.color.il);
                        } else {
                            Context context4 = textView.getContext();
                            l.b(context4, "");
                            color2 = context4.getResources().getColor(R.color.ik);
                        }
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f144275a.getMeasuredWidth()) * 1.0f, 0.0f, color, color2, Shader.TileMode.CLAMP);
                        TextPaint paint = textView.getPaint();
                        l.b(paint, "");
                        paint.setShader(linearGradient);
                        textView.invalidate();
                    }
                });
                return textView;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.a.b.b bVar = this.f144230b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f144230b = com.ss.android.ugc.aweme.util.m.a().d(c.f144245a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new d(this)).a(e.f144249a, new C3847f(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.a.b.b bVar = this.f144230b;
        if (bVar != null) {
            bVar.dispose();
        }
        Animation animation = getTvText().getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        getTvText().clearAnimation();
        p marqueeHelper = getMarqueeHelper();
        marqueeHelper.f142540f = 0;
        marqueeHelper.f142539e = null;
        TextView textView = marqueeHelper.f142542h;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        marqueeHelper.a((List<String>) null);
        marqueeHelper.f142543i.setText(null);
        marqueeHelper.a().removeCallbacks(marqueeHelper.b());
        marqueeHelper.f142535a = true;
    }

    public final void setD(f.a.b.b bVar) {
        this.f144230b = bVar;
    }

    public final void setEnterFrom(String str) {
        this.f144229a = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$f  reason: collision with other inner class name */
    static final class C3847f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144251a;

        static {
            Covode.recordClassIndex(94400);
        }

        C3847f(f fVar) {
            this.f144251a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f144251a.a(z.INSTANCE);
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144247a;

        static {
            Covode.recordClassIndex(94398);
        }

        d(f fVar) {
            this.f144247a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> list = (List) obj;
            f fVar = this.f144247a;
            l.b(list, "");
            fVar.a(list);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f144235b;

        static {
            Covode.recordClassIndex(94395);
        }

        a(f fVar, Context context) {
            this.f144234a = fVar;
            this.f144235b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f144235b, com.ss.android.ugc.aweme.settings.f.a(this.f144234a.getEnterFrom(), "click_banner")).open();
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f144245a = new c();

        static {
            Covode.recordClassIndex(94397);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            JSONObject optJSONObject;
            String optString;
            JSONObject jSONObject = (JSONObject) obj;
            l.d(jSONObject, "");
            JSONArray optJSONArray = jSONObject.optJSONArray("questions_list");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    if (!(jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("question_info")) == null || (optString = optJSONObject.optString("question_text")) == null)) {
                        arrayList.add(optString);
                    }
                }
            }
            return arrayList;
        }
    }

    public final void a(List<String> list) {
        setVisibility(0);
        p marqueeHelper = getMarqueeHelper();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.isEmpty()) {
            arrayList.add(getContext().getString(R.string.bou));
        }
        marqueeHelper.a(arrayList);
        getMarqueeHelper().f142537c = 4000;
        p.a(getMarqueeHelper());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        float f2;
        l.d(context, "");
        MethodCollector.i(3362);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.za, this, true);
        View findViewById = a2.findViewById(R.id.bis);
        l.b(findViewById, "");
        if (gb.a()) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        findViewById.setRotationY(f2);
        a2.setOnClickListener(new a(this, context));
        setVisibility(8);
        this.f144231c = i.a((h.f.a.a) new g(this, context));
        this.f144232d = i.a((h.f.a.a) new h(this));
        this.f144233e = i.a((h.f.a.a) new b(this));
        MethodCollector.o(3362);
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }
}
