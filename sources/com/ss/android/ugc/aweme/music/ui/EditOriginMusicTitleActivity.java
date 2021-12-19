package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class EditOriginMusicTitleActivity extends a implements EditOriginMusicTitlePresenter.b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f111768a = EditOriginMusicTitleActivity.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f111769b;

    /* renamed from: c  reason: collision with root package name */
    EditText f111770c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f111771d;

    /* renamed from: e  reason: collision with root package name */
    public String f111772e;

    /* renamed from: f  reason: collision with root package name */
    public String f111773f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f111774g;

    /* renamed from: h  reason: collision with root package name */
    public EditOriginMusicTitlePresenter f111775h;

    /* renamed from: i  reason: collision with root package name */
    ProgressDialog f111776i;

    /* renamed from: j  reason: collision with root package name */
    private final String f111777j = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(71871);
    }

    private void b() {
        ProgressDialog progressDialog = this.f111776i;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f111776i.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.b
    public final void a() {
        b();
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.f111772e);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
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

    public void onViewClicked(View view) {
        if (view.getId() == R.id.a75) {
            this.f111770c.setText("");
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.b
    public final void a(String str) {
        b();
        if (!TextUtils.isEmpty(str)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(str).a();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.f111769b.getEndText().setTextColor(b.c(this.f111769b.getContext(), R.color.bh));
            this.f111769b.getEndText().setAlpha(1.0f);
            this.f111769b.getEndText().setClickable(true);
            return;
        }
        this.f111769b.getEndText().setTextColor(b.c(this.f111769b.getContext(), R.color.bz));
        this.f111769b.getEndText().setAlpha(0.5f);
        this.f111769b.getEndText().setClickable(false);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new i(xVar));
        super.onCreate(bundle);
        this.f111774g = this;
        setContentView(R.layout.alc);
        this.f111769b = (TextTitleBar) findViewById(R.id.em8);
        this.f111770c = (EditText) findViewById(R.id.crc);
        this.f111771d = (ImageView) findViewById(R.id.a75);
        View findViewById = findViewById(R.id.a75);
        if (findViewById != null) {
            findViewById.setOnClickListener(new j(this));
        }
        this.f111775h = new EditOriginMusicTitlePresenter(this);
        this.f111773f = a(getIntent(), "MUSIC_TITLE");
        a(false);
        this.f111770c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.f111770c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71872);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence.length() > 0) {
                    EditOriginMusicTitleActivity.this.a(true);
                    EditOriginMusicTitleActivity.this.f111771d.setVisibility(0);
                    return;
                }
                EditOriginMusicTitleActivity.this.a(false);
                EditOriginMusicTitleActivity.this.f111771d.setVisibility(4);
            }
        });
        this.f111769b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(71873);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                EditOriginMusicTitleActivity.this.finish();
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                String trim = EditOriginMusicTitleActivity.this.f111770c.getText().toString().trim().replaceAll("[ ]{2,}", " ").trim();
                if (!Pattern.matches("[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+", trim)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(EditOriginMusicTitleActivity.this.f111774g).a(R.string.bjn).a();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", trim);
                } catch (JSONException unused) {
                }
                r.onEvent(MobClick.obtain().setEventName("confirm_title").setLabelName("song_cover").setValue(EditOriginMusicTitleActivity.this.f111773f).setJsonObject(jSONObject));
                r.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("original_music"));
                EditOriginMusicTitleActivity.this.f111772e = trim;
                EditOriginMusicTitlePresenter editOriginMusicTitlePresenter = EditOriginMusicTitleActivity.this.f111775h;
                ((EditOriginMusicTitlePresenter.MusicTitleApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(EditOriginMusicTitlePresenter.MusicTitleApi.class)).alterMusicTitle(EditOriginMusicTitleActivity.this.f111773f, EditOriginMusicTitleActivity.this.f111772e).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b6: INVOKE  
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x00ad: INVOKE  (r1v9 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x00a3: INVOKE  (r1v8 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a> : 0x0099: INVOKE  (r1v7 f.a.t<com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a>) = 
                      (wrap: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi : 0x0097: CHECK_CAST (r0v26 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi) = (com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi) (wrap: java.lang.Object : 0x0093: INVOKE  (r0v25 java.lang.Object) = 
                      (wrap: com.ss.android.ugc.aweme.framework.services.IRetrofit : 0x008d: INVOKE  (r1v6 com.ss.android.ugc.aweme.framework.services.IRetrofit) = 
                      (wrap: com.ss.android.ugc.aweme.framework.services.IRetrofitService : 0x0087: INVOKE  (r1v5 com.ss.android.ugc.aweme.framework.services.IRetrofitService) = false type: STATIC call: com.ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin(boolean):com.ss.android.ugc.aweme.framework.services.IRetrofitService)
                      (wrap: java.lang.String : 0x008b: SGET  (r0v23 java.lang.String) =  com.ss.android.ugc.aweme.app.api.Api.d java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.framework.services.IRetrofitService.createNewRetrofit(java.lang.String):com.ss.android.ugc.aweme.framework.services.IRetrofit)
                      (wrap: java.lang.Class : 0x0091: CONST_CLASS   com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi.class)
                     type: INTERFACE call: com.ss.android.ugc.aweme.framework.services.IRetrofit.create(java.lang.Class):java.lang.Object))
                      (wrap: java.lang.String : 0x0080: IGET  (r6v0 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity : 0x007e: IGET  (r0v21 com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity) = (r7v0 'this' com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity$2 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.a com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity)
                     com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.f java.lang.String)
                      (wrap: java.lang.String : 0x0084: IGET  (r5v0 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity : 0x0082: IGET  (r0v22 com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity) = (r7v0 'this' com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity$2 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.a com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity)
                     com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.e java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.MusicTitleApi.alterMusicTitle(java.lang.String, java.lang.String):f.a.t)
                      (wrap: f.a.aa : 0x009f: INVOKE  (r0v28 f.a.aa) = (wrap: f.a.aa : 0x009d: SGET  (r0v27 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.b(f.a.aa):f.a.t)
                      (wrap: f.a.aa : 0x00a9: INVOKE  (r0v30 f.a.aa) = (wrap: f.a.aa : 0x00a7: SGET  (r0v29 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1 : 0x00b3: CONSTRUCTOR  (r0v31 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1) = (r3v1 'editOriginMusicTitlePresenter' com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter) call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.1.<init>(com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter):void type: CONSTRUCTOR)
                     type: VIRTUAL call: f.a.t.b(f.a.z):void in method: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b3: CONSTRUCTOR  (r0v31 com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$1) = (r3v1 'editOriginMusicTitlePresenter' com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter) call: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.1.<init>(com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.2.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 251
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity.AnonymousClass2.b(android.view.View):void");
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
