package com.ss.android.ugc.aweme.shortvideo.l;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import com.ss.android.ugc.tools.view.a.c;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public View f128721a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f128722b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f128723c;

    /* renamed from: d  reason: collision with root package name */
    public int f128724d = 100;

    /* renamed from: e  reason: collision with root package name */
    public int f128725e = 100;

    /* renamed from: f  reason: collision with root package name */
    public boolean f128726f;

    /* renamed from: g  reason: collision with root package name */
    public a f128727g;

    /* renamed from: h  reason: collision with root package name */
    public b f128728h;

    /* renamed from: i  reason: collision with root package name */
    public View f128729i = null;

    /* renamed from: j  reason: collision with root package name */
    private AVDmtSeekBar f128730j;

    /* renamed from: k  reason: collision with root package name */
    private AVDmtSeekBar f128731k;

    /* renamed from: l  reason: collision with root package name */
    private View f128732l;

    /* renamed from: m  reason: collision with root package name */
    private e f128733m;
    private VideoPublishEditModel n;
    private c o;
    private com.ss.android.ugc.tools.view.a.a p = new r(this);
    private boolean q = false;

    public interface a {
        static {
            Covode.recordClassIndex(84377);
        }

        void a(float f2);

        void b(float f2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(84378);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(84373);
    }

    private void g() {
        this.f128721a.setVisibility(4);
    }

    private void b() {
        if (this.f128726f) {
            this.f128731k.setProgress(this.f128724d);
        }
    }

    private void c() {
        if (this.f128726f) {
            this.f128730j.setProgress(this.f128725e);
        }
    }

    private void e() {
        View view;
        this.f128731k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.l.q.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84374);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                float f2 = (((float) i2) * 1.0f) / 100.0f;
                if (q.this.f128727g != null) {
                    q.this.f128727g.b(f2);
                }
                q.this.f128724d = i2;
            }
        });
        this.f128730j.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.l.q.AnonymousClass2 */

            static {
                Covode.recordClassIndex(84375);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                float f2 = (((float) i2) * 1.0f) / 100.0f;
                if (q.this.f128727g != null) {
                    q.this.f128727g.a(f2);
                }
                q.this.f128725e = i2;
            }
        });
        View view2 = this.f128732l;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.l.q.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(84376);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    q.this.a();
                }
            });
        }
        if (this.q && (view = this.f128729i) != null) {
            view.setOnClickListener(new s(this));
            View view3 = this.f128721a;
            if (view3 != null) {
                view3.setOnClickListener(t.f128739a);
            }
        }
    }

    private void f() {
        this.f128721a.setVisibility(0);
        this.f128721a.setTranslationY(com.ss.android.ttve.utils.b.b(this.f128733m, 400.0f));
        this.f128721a.animate().translationY(0.0f).setDuration(400).start();
    }

    public final void a() {
        b bVar = this.f128728h;
        if (bVar != null) {
            bVar.a();
        }
        try {
            com.ss.android.ugc.aweme.df.q.a("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", this.f128725e).put("mMusicVolume", this.f128724d));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        this.f128730j = (AVDmtSeekBar) this.f128721a.findViewById(R.id.dww);
        this.f128731k = (AVDmtSeekBar) this.f128721a.findViewById(R.id.dwx);
        this.f128730j.setDisplayPercent(true);
        this.f128731k.setDisplayPercent(true);
        this.f128722b = (TextView) this.f128721a.findViewById(R.id.f47);
        this.f128723c = (TextView) this.f128721a.findViewById(R.id.f48);
        this.f128732l = this.f128721a.findViewById(R.id.bv3);
        this.f128730j.setMax(200);
        this.f128731k.setMax(200);
    }

    public final q a(int i2) {
        this.f128724d = i2;
        b();
        return this;
    }

    public final q b(int i2) {
        this.f128725e = i2;
        c();
        return this;
    }

    public q(VideoPublishEditModel videoPublishEditModel) {
        this.n = videoPublishEditModel;
    }

    public final void a(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 100;
        }
        this.f128725e = i2;
    }

    public final void b(boolean z) {
        if (!this.f128726f) {
            this.q = z;
            d();
            e();
            this.f128726f = true;
        }
    }

    public final q d(boolean z) {
        float f2;
        if (this.f128726f) {
            this.f128731k.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar = this.f128731k;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            aVDmtSeekBar.setAlpha(f2);
            if (!z) {
                this.f128731k.setProgress(0);
            }
        }
        return this;
    }

    public final q c(boolean z) {
        float f2;
        if (this.f128726f) {
            this.f128730j.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar = this.f128730j;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            aVDmtSeekBar.setAlpha(f2);
            if (!z) {
                this.f128730j.setProgress(0);
            }
        }
        f(z);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(boolean r4) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.l.q.f(boolean):void");
    }

    public final void e(boolean z) {
        if (this.f128726f) {
            if (z) {
                f();
                c cVar = this.o;
                if (cVar != null) {
                    cVar.c(this.p);
                    this.o.b(this.p);
                    return;
                }
                return;
            }
            g();
            c cVar2 = this.o;
            if (cVar2 != null) {
                cVar2.c(this.p);
            }
        }
    }

    public final void a(e eVar, c cVar) {
        this.f128733m = eVar;
        this.o = cVar;
    }
}
