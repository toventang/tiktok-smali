package com.ss.android.ugc.aweme.story.edit.business.shared.c;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f137274k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f137275a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f137276b;

    /* renamed from: c  reason: collision with root package name */
    View f137277c;

    /* renamed from: d  reason: collision with root package name */
    AVDmtSeekBar f137278d;

    /* renamed from: e  reason: collision with root package name */
    AVDmtSeekBar f137279e;

    /* renamed from: f  reason: collision with root package name */
    public int f137280f = 100;

    /* renamed from: g  reason: collision with root package name */
    public int f137281g = 100;

    /* renamed from: h  reason: collision with root package name */
    public boolean f137282h;

    /* renamed from: i  reason: collision with root package name */
    public b f137283i;

    /* renamed from: j  reason: collision with root package name */
    public c f137284j;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.tools.view.a.a f137285l = new C3599g(this);

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.tools.view.a.c f137286m;

    public interface b {
        static {
            Covode.recordClassIndex(89800);
        }

        void a(float f2);

        void b(float f2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(89801);
        }
    }

    static {
        Covode.recordClassIndex(89798);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89799);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private void a() {
        if (this.f137282h) {
            AVDmtSeekBar aVDmtSeekBar = this.f137279e;
            if (aVDmtSeekBar == null) {
                l.a("mMusicSeekBar");
            }
            aVDmtSeekBar.setProgress(this.f137280f);
        }
    }

    private void b() {
        if (this.f137282h) {
            AVDmtSeekBar aVDmtSeekBar = this.f137278d;
            if (aVDmtSeekBar == null) {
                l.a("mVoiceSeekBar");
            }
            aVDmtSeekBar.setProgress(this.f137281g);
        }
    }

    public static final class d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f137287a;

        static {
            Covode.recordClassIndex(89802);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(g gVar) {
            this.f137287a = gVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            l.d(seekBar, "");
            float f2 = (((float) i2) * 1.0f) / 100.0f;
            b bVar = this.f137287a.f137283i;
            if (bVar != null) {
                bVar.b(f2);
            }
            this.f137287a.f137280f = i2;
        }
    }

    public static final class e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f137288a;

        static {
            Covode.recordClassIndex(89803);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f137288a = gVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            l.d(seekBar, "");
            float f2 = (((float) i2) * 1.0f) / 100.0f;
            b bVar = this.f137288a.f137283i;
            if (bVar != null) {
                bVar.a(f2);
            }
            this.f137288a.f137281g = i2;
        }
    }

    public final void a(int i2) {
        this.f137280f = i2;
        a();
    }

    public final void b(int i2) {
        this.f137281g = i2;
        b();
    }

    public g(com.ss.android.ugc.tools.view.a.c cVar) {
        this.f137286m = cVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f137289a;

        static {
            Covode.recordClassIndex(89804);
        }

        f(g gVar) {
            this.f137289a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            g gVar = this.f137289a;
            try {
                q.a("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", gVar.f137281g).put("mMusicVolume", gVar.f137280f));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(boolean z) {
        float f2;
        if (this.f137282h) {
            AVDmtSeekBar aVDmtSeekBar = this.f137278d;
            if (aVDmtSeekBar == null) {
                l.a("mVoiceSeekBar");
            }
            aVDmtSeekBar.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar2 = this.f137278d;
            if (aVDmtSeekBar2 == null) {
                l.a("mVoiceSeekBar");
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            aVDmtSeekBar2.setAlpha(f2);
            if (!z) {
                AVDmtSeekBar aVDmtSeekBar3 = this.f137278d;
                if (aVDmtSeekBar3 == null) {
                    l.a("mVoiceSeekBar");
                }
                aVDmtSeekBar3.setProgress(0);
            }
        }
    }

    public final void b(boolean z) {
        float f2;
        if (this.f137282h) {
            AVDmtSeekBar aVDmtSeekBar = this.f137279e;
            if (aVDmtSeekBar == null) {
                l.a("mMusicSeekBar");
            }
            aVDmtSeekBar.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar2 = this.f137279e;
            if (aVDmtSeekBar2 == null) {
                l.a("mMusicSeekBar");
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            aVDmtSeekBar2.setAlpha(f2);
            if (!z) {
                AVDmtSeekBar aVDmtSeekBar3 = this.f137279e;
                if (aVDmtSeekBar3 == null) {
                    l.a("mMusicSeekBar");
                }
                aVDmtSeekBar3.setProgress(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$g  reason: collision with other inner class name */
    static final class C3599g implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f137290a;

        static {
            Covode.recordClassIndex(89805);
        }

        C3599g(g gVar) {
            this.f137290a = gVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f137290a.f137282h || this.f137290a.f137284j == null) {
                return false;
            }
            return true;
        }
    }
}
