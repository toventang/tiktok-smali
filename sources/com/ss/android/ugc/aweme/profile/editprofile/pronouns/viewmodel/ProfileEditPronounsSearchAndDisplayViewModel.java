package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ProfileEditPronounsSearchAndDisplayViewModel extends AssemViewModel<b> {
    public static final a r = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final SpannableStringBuilder f116231j = new SpannableStringBuilder();

    /* renamed from: k  reason: collision with root package name */
    public final List<String> f116232k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final Map<com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.a, List<String>> f116233l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    public List<String> f116234m = z.INSTANCE;
    public int n = 4;
    public Boolean o;
    public int p = Integer.MAX_VALUE;
    public final Map<Integer, Integer> q = new LinkedHashMap();
    private boolean s = true;
    private int t;

    static {
        Covode.recordClassIndex(75026);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75027);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ b f() {
        return new b();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        this.f116233l.clear();
        super.onCleared();
    }

    private final com.bytedance.tux.f.a.a g() {
        int i2 = this.t;
        this.t = i2 + 1;
        this.q.put(Integer.valueOf(i2), Integer.valueOf(this.f116231j.length() - 1));
        return new c(this, i2);
    }

    public static final class b extends m implements h.f.a.b<b, h.z> {
        final /* synthetic */ ProfileEditPronounsSearchAndDisplayViewModel this$0;

        static {
            Covode.recordClassIndex(75028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel) {
            super(1);
            this.this$0 = profileEditPronounsSearchAndDisplayViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(b bVar) {
            l.d(bVar, "");
            this.this$0.a(AnonymousClass1.f116235a);
            return h.z.f158842a;
        }
    }

    public static final class c extends com.bytedance.tux.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileEditPronounsSearchAndDisplayViewModel f116236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f116237b;

        static {
            Covode.recordClassIndex(75030);
        }

        static final class a extends m implements h.f.a.b<b, h.z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(75031);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(b bVar) {
                l.d(bVar, "");
                this.this$0.f116236a.a(AnonymousClass1.f116238a);
                return h.z.f158842a;
            }
        }

        public final void onClick(View view) {
            l.d(view, "");
            Integer num = this.f116236a.q.get(Integer.valueOf(this.f116237b));
            if (num != null) {
                num.intValue();
                for (Integer num2 : this.f116236a.q.keySet()) {
                    int intValue = num2.intValue();
                    Integer num3 = this.f116236a.q.get(Integer.valueOf(intValue));
                    if (num3 == null) {
                        l.b();
                    }
                    if (num3.intValue() > num.intValue()) {
                        Map<Integer, Integer> map = this.f116236a.q;
                        Integer valueOf = Integer.valueOf(intValue);
                        Integer num4 = this.f116236a.q.get(Integer.valueOf(intValue));
                        if (num4 == null) {
                            l.b();
                        }
                        map.put(valueOf, Integer.valueOf(num4.intValue() - 1));
                    }
                }
                this.f116236a.f116231j.delete(num.intValue(), num.intValue() + 1);
                this.f116236a.f116232k.remove(num.intValue());
                this.f116236a.q.put(Integer.valueOf(this.f116237b), -1);
                this.f116236a.b(new a(this));
            }
        }

        c(ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel, int i2) {
            this.f116236a = profileEditPronounsSearchAndDisplayViewModel;
            this.f116237b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f116240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f116241b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f116242c;

        static {
            Covode.recordClassIndex(75034);
        }

        e(LinearLayout.LayoutParams layoutParams, int i2, View view) {
            this.f116240a = layoutParams;
            this.f116241b = i2;
            this.f116242c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            this.f116240a.topMargin = this.f116241b + intValue;
            this.f116242c.setLayoutParams(this.f116240a);
        }
    }

    private static com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b b(Context context, String str) {
        com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b bVar = new com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b(context, (byte) 0);
        bVar.a(str);
        return bVar;
    }

    public static final class d<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116239a = new d();

        static {
            Covode.recordClassIndex(75033);
        }

        d() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i2;
            int i3;
            com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b bVar = (com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b) obj;
            com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b bVar2 = (com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.b) obj2;
            if (bVar.f116217b != bVar2.f116217b) {
                i2 = bVar.f116217b;
                i3 = bVar2.f116217b;
            } else {
                i2 = bVar.f116218c;
                i3 = bVar2.f116218c;
            }
            return i2 - i3;
        }
    }

    private static com.bytedance.tux.f.a.e<com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b> a(Context context, String str) {
        com.bytedance.tux.f.a.e<com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b> eVar = new com.bytedance.tux.f.a.e<>(b(context, str));
        eVar.f45046b = (int) i.a.a.a.a.b.a(8.0f);
        return eVar;
    }

    private static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i3 = layoutParams2.topMargin;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
        l.b(ofInt, "");
        ofInt.setDuration(100L);
        ofInt.addUpdateListener(new e(layoutParams2, i3, view));
        ofInt.start();
    }

    private final void b(EditText editText, int i2) {
        Editable text = editText.getText();
        int selectionEnd = Selection.getSelectionEnd(text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) this.f116231j);
        l.b(text, "");
        append.append((CharSequence) text.subSequence(this.f116231j.length(), i2).toString());
        editText.setText(spannableStringBuilder);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
    }

    public final void a(Context context, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f116231j.append((CharSequence) "*");
            this.f116232k.add(list.get(i2));
            com.bytedance.tux.f.a.e<com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b> a2 = a(context, list.get(i2));
            com.bytedance.tux.f.a.a g2 = g();
            int length = this.f116231j.length() - 1;
            int length2 = this.f116231j.length();
            this.f116231j.setSpan(a2, length, length2, 33);
            this.f116231j.setSpan(g2, length, length2, 33);
        }
        this.f116231j.setSpan(new com.bytedance.tux.f.a.d(71), 0, this.f116231j.length(), 33);
    }

    public final void a(boolean z, View view) {
        if (!l.a((Object) this.o, (Object) true)) {
            if (z) {
                if (!this.s) {
                    this.s = true;
                    a(view, view.getHeight());
                }
            } else if (this.s) {
                this.s = false;
                a(view, -view.getHeight());
            }
        }
    }

    public final boolean a(EditText editText, int i2) {
        if (editText.getText().length() <= i2) {
            return false;
        }
        b(editText, i2);
        return true;
    }
}
