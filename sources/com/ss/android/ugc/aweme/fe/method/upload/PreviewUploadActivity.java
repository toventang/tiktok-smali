package com.ss.android.ugc.aweme.fe.method.upload;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.VideoView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewUploadActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public String f91343a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f91344b;

    static {
        Covode.recordClassIndex(57492);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f91344b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f91344b == null) {
            this.f91344b = new SparseArray();
        }
        View view = (View) this.f91344b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f91344b.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        if (_$_findCachedViewById(R.id.fhs) != null) {
            ((VideoView) _$_findCachedViewById(R.id.fhs)).suspend();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (_$_findCachedViewById(R.id.fhs) != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fhs);
            l.b(videoView, "");
            if (!videoView.isPlaying()) {
                ((VideoView) _$_findCachedViewById(R.id.fhs)).start();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (_$_findCachedViewById(R.id.fhs) != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fhs);
            l.b(videoView, "");
            if (videoView.isPlaying()) {
                ((VideoView) _$_findCachedViewById(R.id.fhs)).pause();
            }
        }
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewUploadActivity f91346a;

        static {
            Covode.recordClassIndex(57494);
        }

        b(PreviewUploadActivity previewUploadActivity) {
            this.f91346a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f91346a.f91343a);
            this.f91346a.setResult(-1, intent);
            this.f91346a.finish();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewUploadActivity f91347a;

        static {
            Covode.recordClassIndex(57495);
        }

        c(PreviewUploadActivity previewUploadActivity) {
            this.f91347a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f91347a.f91343a);
            this.f91347a.setResult(0, intent);
            this.f91347a.finish();
        }
    }

    static final class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewUploadActivity f91345a;

        static {
            Covode.recordClassIndex(57493);
        }

        a(PreviewUploadActivity previewUploadActivity) {
            this.f91345a = previewUploadActivity;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            TuxTextView tuxTextView = (TuxTextView) this.f91345a._$_findCachedViewById(R.id.fcc);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) this.f91345a._$_findCachedViewById(R.id.fcb);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            l.b(mediaPlayer, "");
            mediaPlayer.setLooping(true);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v3);
        String a2 = a(getIntent(), "filePath");
        this.f91343a = a2;
        if (a2 != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fhs);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.f91343a);
            videoView.setOnPreparedListener(new a(this));
        }
        ((TuxTextView) _$_findCachedViewById(R.id.fcc)).setOnClickListener(new b(this));
        ((TuxTextView) _$_findCachedViewById(R.id.fcb)).setOnClickListener(new c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
