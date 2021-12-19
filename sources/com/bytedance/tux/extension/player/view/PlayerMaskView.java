package com.bytedance.tux.extension.player.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.a.d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.input.slider.TuxSlider;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class PlayerMaskView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f44968e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f44969a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44970b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44971c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f44972d;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f44973f;

    public interface b {
        static {
            Covode.recordClassIndex(27447);
        }

        void a();

        void a(int i2);

        void b();

        void b(int i2);

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(27445);
    }

    public final View a(int i2) {
        if (this.f44973f == null) {
            this.f44973f = new HashMap();
        }
        View view = (View) this.f44973f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f44973f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27446);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getNeedShowMask() {
        return this.f44972d;
    }

    public final b getOnPlayerActionBarListener() {
        return this.f44969a;
    }

    public final void a() {
        this.f44972d = true;
        com.bytedance.tux.extension.player.a.d.a(a(R.id.ad7), null, 6);
    }

    public final void b() {
        com.bytedance.tux.extension.player.a.d.a(a(R.id.ad7), new k(this), 2);
    }

    public final void e() {
        View a2 = a(R.id.bx);
        l.a((Object) a2, "");
        a2.setVisibility(0);
    }

    public final void c() {
        this.f44971c = false;
        Group group = (Group) a(R.id.d5q);
        l.a((Object) group, "");
        group.setVisibility(8);
        if (com.bytedance.tux.extension.player.e.f44964b != com.bytedance.tux.extension.player.c.PREVIEW || com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_IDLE) {
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) a(R.id.d5h);
            l.a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(0);
        }
    }

    public final void d() {
        if (this.f44971c || (com.bytedance.tux.extension.player.e.f44964b == com.bytedance.tux.extension.player.c.PREVIEW && com.bytedance.tux.extension.player.e.f44963a != com.bytedance.tux.extension.player.d.PLAYER_IDLE)) {
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) a(R.id.d5h);
            l.a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            return;
        }
        TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) a(R.id.d5h);
        l.a((Object) tuxPlayerStateView2, "");
        tuxPlayerStateView2.setVisibility(0);
        Group group = (Group) a(R.id.d5q);
        l.a((Object) group, "");
        group.setVisibility(8);
        TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) a(R.id.el_);
        l.a((Object) tuxPlayerTimeView, "");
        tuxPlayerTimeView.setVisibility(8);
    }

    public final void setCustomSliding(boolean z) {
        this.f44970b = z;
    }

    public final void setLoading(boolean z) {
        this.f44971c = z;
    }

    public final void setNeedShowMask(boolean z) {
        this.f44972d = z;
    }

    public final void setOnPlayerActionBarListener(b bVar) {
        this.f44969a = bVar;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44974a;

        static {
            Covode.recordClassIndex(27448);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(PlayerMaskView playerMaskView) {
            this.f44974a = playerMaskView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f44974a.setNeedShowMask(false);
        }
    }

    public static final class h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44983a;

        static {
            Covode.recordClassIndex(27453);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(PlayerMaskView playerMaskView) {
            this.f44983a = playerMaskView;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f44983a.setCustomSliding(true);
            b onPlayerActionBarListener = this.f44983a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                onPlayerActionBarListener.e();
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            int i2 = 0;
            this.f44983a.setCustomSliding(false);
            b onPlayerActionBarListener = this.f44983a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                if (seekBar != null) {
                    i2 = seekBar.getProgress();
                }
                onPlayerActionBarListener.b(i2);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            b onPlayerActionBarListener = this.f44983a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                onPlayerActionBarListener.a(i2);
            }
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44986a;

        static {
            Covode.recordClassIndex(27456);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(PlayerMaskView playerMaskView) {
            this.f44986a = playerMaskView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f44986a.setNeedShowMask(true);
            this.f44986a.a(3000L);
        }
    }

    public static final class d extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44975c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44976d;

        static {
            Covode.recordClassIndex(27449);
        }

        public d(PlayerMaskView playerMaskView) {
            this.f44976d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            b onPlayerActionBarListener;
            if (view != null && this.f44976d.getNeedShowMask() && (onPlayerActionBarListener = this.f44976d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.b();
            }
        }
    }

    public static final class e extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44977c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44978d;

        static {
            Covode.recordClassIndex(27450);
        }

        public e(PlayerMaskView playerMaskView) {
            this.f44978d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            b onPlayerActionBarListener;
            if (view != null && this.f44978d.getNeedShowMask() && (onPlayerActionBarListener = this.f44978d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.c();
            }
        }
    }

    public static final class f extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44979c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44980d;

        static {
            Covode.recordClassIndex(27451);
        }

        public f(PlayerMaskView playerMaskView) {
            this.f44980d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            b onPlayerActionBarListener;
            if (view != null && (onPlayerActionBarListener = this.f44980d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.d();
            }
        }
    }

    public static final class g extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f44981c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44982d;

        static {
            Covode.recordClassIndex(27452);
        }

        public g(PlayerMaskView playerMaskView) {
            this.f44982d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            b onPlayerActionBarListener;
            if (view != null && (onPlayerActionBarListener = this.f44982d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.a();
            }
        }
    }

    public final void setNetSpeed(int i2) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.d5t);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(i2 + " KB/s");
    }

    public final void a(long j2) {
        d.a aVar = new d.a(a(R.id.ad7), new c(this));
        com.bytedance.tux.extension.player.a.d.f44950a = aVar;
        com.bytedance.tux.extension.player.a.d.a().removeCallbacksAndMessages(null);
        com.bytedance.tux.extension.player.a.d.a().postDelayed(aVar, j2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44984a;

        static {
            Covode.recordClassIndex(27454);
        }

        i(PlayerMaskView playerMaskView) {
            this.f44984a = playerMaskView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() == 0) {
                this.f44984a.a();
                return false;
            } else if ((valueOf.intValue() != 1 && valueOf.intValue() != 3) || com.bytedance.tux.extension.player.e.f44963a != com.bytedance.tux.extension.player.d.PLAYER_START) {
                return false;
            } else {
                this.f44984a.a(3000L);
                return false;
            }
        }
    }

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerMaskView f44985a;

        static {
            Covode.recordClassIndex(27455);
        }

        j(PlayerMaskView playerMaskView) {
            this.f44985a = playerMaskView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || valueOf.intValue() == 0) {
                return false;
            }
            if (valueOf.intValue() != 1 && valueOf.intValue() != 3) {
                return false;
            }
            if (!this.f44985a.getNeedShowMask()) {
                this.f44985a.b();
                return false;
            }
            this.f44985a.a(0L);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PlayerMaskView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(9531);
        com.a.a(LayoutInflater.from(getContext()), R.layout.bjr, this, true);
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) a(R.id.d5q);
        l.a((Object) aVar, "");
        aVar.setReferencedIds(new int[]{R.id.d5s, R.id.d5t});
        Group group = (Group) a(R.id.d5q);
        l.a((Object) group, "");
        group.setVisibility(8);
        androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) a(R.id.fg2);
        l.a((Object) aVar2, "");
        aVar2.setReferencedIds(new int[]{R.id.fg3, R.id.d5w, R.id.d5x});
        Group group2 = (Group) a(R.id.fg2);
        l.a((Object) group2, "");
        group2.setVisibility(8);
        androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) a(R.id.fh1);
        l.a((Object) aVar3, "");
        aVar3.setReferencedIds(new int[]{R.id.fh2, R.id.d5y, R.id.d5z});
        Group group3 = (Group) a(R.id.fh1);
        l.a((Object) group3, "");
        group3.setVisibility(8);
        TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) a(R.id.d5r);
        l.a((Object) tuxPlayerStateView, "");
        tuxPlayerStateView.setOnClickListener(new d(this));
        ((TuxSlider) a(R.id.e62)).setOnSeekBarChangeListener(new h(this));
        ImageView imageView = (ImageView) a(R.id.b_i);
        l.a((Object) imageView, "");
        imageView.setOnClickListener(new e(this));
        TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) a(R.id.e7v);
        l.a((Object) tuxPlayerStateView2, "");
        tuxPlayerStateView2.setOnClickListener(new f(this));
        View a2 = a(R.id.fh2);
        l.a((Object) a2, "");
        a2.setOnClickListener(new g(this));
        ((TuxSlider) a(R.id.e62)).setOnTouchListener(new i(this));
        ((ConstraintLayout) a(R.id.ad7)).setOnTouchListener(new j(this));
        MethodCollector.o(9531);
    }
}
