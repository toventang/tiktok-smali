package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.Group;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.input.slider.TuxSlider;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.f.h;
import com.ss.android.ugc.aweme.livewallpaper.f.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f108985a;

    static {
        Covode.recordClassIndex(69780);
    }

    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f108987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SeekBar.OnSeekBarChangeListener f108988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f108989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TuxSlider f108990d;

        static {
            Covode.recordClassIndex(69782);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f108988b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            l.d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f108988b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
            String str = this.f108989c;
            TuxSlider tuxSlider = this.f108990d;
            l.b(tuxSlider, "");
            int progress = tuxSlider.getProgress();
            l.d(str, "");
            r.a("adjust_wallpaper_volume", new com.ss.android.ugc.aweme.app.f.d().a("progress", progress).a("enter_from", str).f66730a);
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            l.d(seekBar, "");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f108988b;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i2, z);
            }
        }

        b(o oVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, String str, TuxSlider tuxSlider) {
            this.f108987a = oVar;
            this.f108988b = onSeekBarChangeListener;
            this.f108989c = str;
            this.f108990d = tuxSlider;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f108993a;

        static {
            Covode.recordClassIndex(69784);
        }

        d(o oVar) {
            this.f108993a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.tux.sheet.sheet.a aVar = this.f108993a.f108985a;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    private static void a(String str) {
        r.a("wallpaper_preferences_dialog_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
    }

    public static final class e implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxSwitch f108994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TuxSlider f108995b;

        static {
            Covode.recordClassIndex(69785);
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            MethodCollector.i(9287);
            TuxSwitch tuxSwitch = this.f108994a;
            l.b(tuxSwitch, "");
            boolean isChecked = tuxSwitch.isChecked();
            TuxSlider tuxSlider = this.f108995b;
            l.b(tuxSlider, "");
            int progress = tuxSlider.getProgress();
            h.a(isChecked);
            h.a(progress);
            if (f.d()) {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(k.f108931g, isChecked);
                jSONObject.put(k.f108932h, progress);
                String jSONObject2 = jSONObject.toString();
                l.b(jSONObject2, "");
                bundle.putString("wallpaper_preferences", jSONObject2);
                try {
                    com.bytedance.ies.ugc.appcontext.d.a().getContentResolver().call(com.ss.android.ugc.aweme.livewallpaper.f.c.f108898c, "update_preferences", "", bundle);
                    MethodCollector.o(9287);
                } catch (Throwable unused) {
                    MethodCollector.o(9287);
                }
            } else {
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                if (a2 != null && f.a(a2, a2.getPackageName())) {
                    Intent intent = new Intent();
                    intent.setClass(a2, AmeLiveWallpaper.class);
                    intent.putExtra("action", "action_update_volume");
                    com.ss.android.ugc.aweme.livewallpaper.d.c.a(a2, intent);
                }
                MethodCollector.o(9287);
            }
        }

        e(TuxSwitch tuxSwitch, TuxSlider tuxSlider) {
            this.f108994a = tuxSwitch;
            this.f108995b = tuxSlider;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tux.a.i.a f108986a;

        static {
            Covode.recordClassIndex(69781);
        }

        a(com.ss.android.ugc.aweme.tux.a.i.a aVar) {
            this.f108986a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f108986a.a();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f108991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f108992b;

        static {
            Covode.recordClassIndex(69783);
        }

        c(o oVar, String str) {
            this.f108991a = oVar;
            this.f108992b = str;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            r.a("click_double_tap_to_pause_switch", new com.ss.android.ugc.aweme.app.f.d().a("action", z ? 1 : 0).a("enter_from", this.f108992b).f66730a);
        }
    }

    public final void a(Context context, boolean z, String str, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        MethodCollector.i(10022);
        l.d(context, "");
        l.d(str, "");
        View inflate = View.inflate(context, R.layout.bkj, null);
        TuxSwitch tuxSwitch = (TuxSwitch) inflate.findViewById(R.id.d2g);
        TuxSlider tuxSlider = (TuxSlider) inflate.findViewById(R.id.e7i);
        Group group = (Group) inflate.findViewById(R.id.e7f);
        l.b(tuxSwitch, "");
        tuxSwitch.setChecked(h.e());
        l.b(tuxSlider, "");
        tuxSlider.setProgress(h.f());
        tuxSlider.setOnSeekBarChangeListener(new b(this, onSeekBarChangeListener, str, tuxSlider));
        tuxSwitch.setOnCheckedChangeListener(new c(this, str));
        l.b(group, "");
        if (group.getVisibility() == 0 && z) {
            tuxSlider.setAlpha(0.75f);
            tuxSlider.setEnabled(false);
            com.ss.android.ugc.aweme.tux.a.i.a a2 = new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.he8);
            View findViewById = inflate.findViewById(R.id.crq);
            findViewById.setOnTouchListener(new a(a2));
            findViewById.setVisibility(0);
        }
        inflate.findViewById(R.id.a7y).setOnClickListener(new d(this));
        a.C1112a aVar = new a.C1112a();
        l.b(inflate, "");
        com.bytedance.tux.sheet.sheet.a aVar2 = aVar.a(inflate).a(1).a(true).a(new e(tuxSwitch, tuxSlider)).f45299a;
        this.f108985a = aVar2;
        if (aVar2 != null) {
            aVar2.show(((androidx.fragment.app.e) context).getSupportFragmentManager(), "");
        }
        a(str);
        MethodCollector.o(10022);
    }
}
