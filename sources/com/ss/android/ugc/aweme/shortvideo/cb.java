package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.shortvideo.z;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

public final class cb extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    CircularProgressView f125065a;

    /* renamed from: b  reason: collision with root package name */
    TextView f125066b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f125067c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f125068d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f125069e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f125070f;

    /* renamed from: g  reason: collision with root package name */
    public final aa f125071g = new aa();

    /* renamed from: h  reason: collision with root package name */
    public final cc f125072h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f125073i;

    static {
        Covode.recordClassIndex(82165);
    }

    public static final class a extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(82166);
        }

        a() {
        }

        public final void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) n.a(4.0d));
            }
        }
    }

    public static final class g implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125081c;

        static {
            Covode.recordClassIndex(82172);
        }

        public g(cb cbVar, z zVar, ViewPropertyAnimator viewPropertyAnimator) {
            this.f125079a = cbVar;
            this.f125080b = zVar;
            this.f125081c = viewPropertyAnimator;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.z.a
        public final void a() {
            this.f125079a.f125071g.b(this.f125080b);
            this.f125081c.cancel();
        }
    }

    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125083b;

        static {
            Covode.recordClassIndex(82173);
        }

        public h(cb cbVar, z zVar) {
            this.f125082a = cbVar;
            this.f125083b = zVar;
        }

        public final void run() {
            this.f125082a.f125071g.b(this.f125083b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f125073i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class i implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125086c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125087d;

        static {
            Covode.recordClassIndex(82174);
        }

        public i(cb cbVar, z zVar, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2) {
            this.f125084a = cbVar;
            this.f125085b = zVar;
            this.f125086c = viewPropertyAnimator;
            this.f125087d = viewPropertyAnimator2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.z.a
        public final void a() {
            this.f125084a.f125071g.b(this.f125085b);
            this.f125086c.cancel();
            this.f125087d.cancel();
        }
    }

    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f125090c;

        static {
            Covode.recordClassIndex(82175);
        }

        public j(cb cbVar, z zVar, h.f.a.a aVar) {
            this.f125088a = cbVar;
            this.f125089b = zVar;
            this.f125090c = aVar;
        }

        public final void run() {
            this.f125088a.f125071g.b(this.f125089b);
            this.f125090c.invoke();
            this.f125088a.d();
        }
    }

    public static final class k implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125094d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f125095e;

        static {
            Covode.recordClassIndex(82176);
        }

        public k(cb cbVar, z zVar, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2, ViewPropertyAnimator viewPropertyAnimator3) {
            this.f125091a = cbVar;
            this.f125092b = zVar;
            this.f125093c = viewPropertyAnimator;
            this.f125094d = viewPropertyAnimator2;
            this.f125095e = viewPropertyAnimator3;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.z.a
        public final void a() {
            this.f125091a.f125071g.b(this.f125092b);
            this.f125093c.cancel();
            this.f125094d.cancel();
            this.f125095e.cancel();
        }
    }

    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f125097b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f125098c;

        static {
            Covode.recordClassIndex(82177);
        }

        public l(cb cbVar, z zVar, h.f.a.a aVar) {
            this.f125096a = cbVar;
            this.f125097b = zVar;
            this.f125098c = aVar;
        }

        public final void run() {
            this.f125096a.f125071g.b(this.f125097b);
            this.f125098c.invoke();
            this.f125096a.d();
        }
    }

    public cb() {
        cc ccVar = new cc();
        ccVar.f125100b.setValue(-1);
        ccVar.a(0);
        this.f125072h = ccVar;
    }

    public final void a() {
        requireFragmentManager().a().a(R.anim.ds, R.anim.dt).c(this).c();
    }

    public final void b() {
        requireFragmentManager().a().b(this).c();
    }

    public final void c() {
        if (getFragmentManager() != null) {
            androidx.fragment.app.i fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                h.f.b.l.b();
            }
            fragmentManager.a().a(this).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            a.C3244a.a(activity).a("upload_progress_fragment", false);
        }
        c();
        super.onDestroy();
    }

    public final void d() {
        ImageView imageView = this.f125067c;
        if (imageView == null) {
            h.f.b.l.a("mBGCoverFirst");
        }
        imageView.setAlpha(1.0f);
        ImageView imageView2 = this.f125067c;
        if (imageView2 == null) {
            h.f.b.l.a("mBGCoverFirst");
        }
        imageView2.setTranslationX(0.0f);
        ImageView imageView3 = this.f125067c;
        if (imageView3 == null) {
            h.f.b.l.a("mBGCoverFirst");
        }
        imageView3.setTranslationY(0.0f);
        ImageView imageView4 = this.f125068d;
        if (imageView4 == null) {
            h.f.b.l.a("mBGCoverSecond");
        }
        imageView4.setAlpha(1.0f);
        ImageView imageView5 = this.f125068d;
        if (imageView5 == null) {
            h.f.b.l.a("mBGCoverSecond");
        }
        imageView5.setTranslationX(0.0f);
        ImageView imageView6 = this.f125068d;
        if (imageView6 == null) {
            h.f.b.l.a("mBGCoverSecond");
        }
        imageView6.setTranslationY(0.0f);
        ImageView imageView7 = this.f125069e;
        if (imageView7 == null) {
            h.f.b.l.a("mBGCoverThird");
        }
        imageView7.setAlpha(1.0f);
        ImageView imageView8 = this.f125069e;
        if (imageView8 == null) {
            h.f.b.l.a("mBGCoverThird");
        }
        imageView8.setTranslationX(0.0f);
        ImageView imageView9 = this.f125069e;
        if (imageView9 == null) {
            h.f.b.l.a("mBGCoverThird");
        }
        imageView9.setTranslationY(0.0f);
    }

    private static void a(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new a());
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125076a;

        static {
            Covode.recordClassIndex(82169);
        }

        d(cb cbVar) {
            this.f125076a = cbVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f125076a.f125067c;
            if (imageView == null) {
                h.f.b.l.a("mBGCoverFirst");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125077a;

        static {
            Covode.recordClassIndex(82170);
        }

        e(cb cbVar) {
            this.f125077a = cbVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f125077a.f125068d;
            if (imageView == null) {
                h.f.b.l.a("mBGCoverSecond");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125078a;

        static {
            Covode.recordClassIndex(82171);
        }

        f(cb cbVar) {
            this.f125078a = cbVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f125078a.f125069e;
            if (imageView == null) {
                h.f.b.l.a("mBGCoverThird");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125074a;

        static {
            Covode.recordClassIndex(82167);
        }

        b(cb cbVar) {
            this.f125074a = cbVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            cb cbVar = this.f125074a;
            h.f.b.l.b(num, "");
            int intValue = num.intValue();
            CircularProgressView circularProgressView = cbVar.f125065a;
            if (circularProgressView == null) {
                h.f.b.l.a("mProgressView");
            }
            circularProgressView.setProgress((float) intValue);
            TextView textView = cbVar.f125066b;
            if (textView == null) {
                h.f.b.l.a("mProgressText");
            }
            textView.setText(new StringBuilder().append(intValue).append('%').toString());
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cb f125075a;

        static {
            Covode.recordClassIndex(82168);
        }

        c(cb cbVar) {
            this.f125075a = cbVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null || num.intValue() != -1) {
                TextView textView = this.f125075a.f125070f;
                if (textView == null) {
                    h.f.b.l.a("mTvVideoCount");
                }
                Context requireContext = this.f125075a.requireContext();
                h.f.b.l.b(requireContext, "");
                textView.setText(requireContext.getResources().getString(R.string.ess, num));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View view2;
        ViewParent viewParent;
        View findViewById;
        View findViewById2;
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            a.C3244a.a(activity).a("upload_progress_fragment", true);
        }
        androidx.fragment.app.e activity2 = getActivity();
        ViewParent viewParent2 = null;
        if (activity2 != null) {
            view = activity2.findViewById(R.id.ed2);
        } else {
            view = null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).setClipChildren(false);
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 != null) {
            view2 = activity3.findViewById(R.id.ed2);
        } else {
            view2 = null;
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).setClipToPadding(false);
        androidx.fragment.app.e activity4 = getActivity();
        if (activity4 == null || (findViewById2 = activity4.findViewById(R.id.ed2)) == null) {
            viewParent = null;
        } else {
            viewParent = findViewById2.getParent();
        }
        Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent).setClipChildren(false);
        androidx.fragment.app.e activity5 = getActivity();
        if (!(activity5 == null || (findViewById = activity5.findViewById(R.id.ed2)) == null)) {
            viewParent2 = findViewById.getParent();
        }
        Objects.requireNonNull(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent2).setClipToPadding(false);
        this.f125072h.f125099a.observe(this, new b(this));
        this.f125072h.f125100b.observe(this, new c(this));
        this.f125072h.f125101c.observe(this, new d(this));
        this.f125072h.f125102d.observe(this, new e(this));
        this.f125072h.f125103e.observe(this, new f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.byw);
        h.f.b.l.b(findViewById, "");
        CircularProgressView circularProgressView = (CircularProgressView) findViewById;
        this.f125065a = circularProgressView;
        if (circularProgressView == null) {
            h.f.b.l.a("mProgressView");
        }
        circularProgressView.setIndeterminate(false);
        View findViewById2 = view.findViewById(R.id.dby);
        h.f.b.l.b(findViewById2, "");
        this.f125066b = (TextView) findViewById2;
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            a.C3244a.a(activity).a("upload_progress_fragment", true);
        }
        View findViewById3 = view.findViewById(R.id.ss);
        h.f.b.l.b(findViewById3, "");
        this.f125067c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.su);
        h.f.b.l.b(findViewById4, "");
        this.f125068d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.sv);
        h.f.b.l.b(findViewById5, "");
        this.f125069e = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.byw);
        h.f.b.l.b(findViewById6, "");
        CircularProgressView circularProgressView2 = (CircularProgressView) findViewById6;
        this.f125065a = circularProgressView2;
        if (circularProgressView2 == null) {
            h.f.b.l.a("mProgressView");
        }
        circularProgressView2.setIndeterminate(false);
        View findViewById7 = view.findViewById(R.id.dby);
        h.f.b.l.b(findViewById7, "");
        this.f125066b = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.ev3);
        h.f.b.l.b(findViewById8, "");
        this.f125070f = (TextView) findViewById8;
        if (Build.VERSION.SDK_INT >= 21) {
            ImageView imageView = this.f125067c;
            if (imageView == null) {
                h.f.b.l.a("mBGCoverFirst");
            }
            a(imageView);
            ImageView imageView2 = this.f125068d;
            if (imageView2 == null) {
                h.f.b.l.a("mBGCoverSecond");
            }
            a(imageView2);
            ImageView imageView3 = this.f125069e;
            if (imageView3 == null) {
                h.f.b.l.a("mBGCoverThird");
            }
            a(imageView3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a1g, viewGroup, false);
    }
}
