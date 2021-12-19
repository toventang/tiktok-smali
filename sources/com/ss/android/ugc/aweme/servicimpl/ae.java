package com.ss.android.ugc.aweme.servicimpl;

import android.app.Application;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.text.effect.o;
import com.ss.android.ugc.aweme.port.in.bh;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.zhiliaoapp.musically.R;
import dmt.av.video.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class ae implements bh {

    /* renamed from: a  reason: collision with root package name */
    o f121849a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.text.a f121850b = new com.ss.android.ugc.aweme.sticker.text.a();

    static {
        Covode.recordClassIndex(79901);
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $listener;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(79908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ae aeVar, h.f.a.a aVar) {
            super(0);
            this.this$0 = aeVar;
            this.$listener = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f121849a = null;
            h.f.a.a aVar = this.$listener;
            if (aVar != null) {
                aVar.invoke();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void a() {
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
        com.ss.android.ugc.aweme.sticker.text.c.b();
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $listener;
        final /* synthetic */ boolean $releaseRes;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(79907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ae aeVar, boolean z, h.f.a.a aVar) {
            super(0);
            this.this$0 = aeVar;
            this.$releaseRes = z;
            this.$listener = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            if (this.$releaseRes) {
                this.this$0.f121849a = null;
            }
            h.f.a.a aVar = this.$listener;
            if (aVar != null) {
                aVar.invoke();
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(79905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ae aeVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = aeVar;
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.this$0.f121849a = null;
            }
            h.f.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(79906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ae aeVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = aeVar;
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.this$0.f121849a = null;
            }
            h.f.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<h.f.a.b<? super Boolean, ? extends z>, z> {
        final /* synthetic */ androidx.appcompat.app.d $appCompatActivity$inlined;
        final /* synthetic */ AVETParameter $etParams$inlined;
        final /* synthetic */ String $fontPanel$inlined;
        final /* synthetic */ FrameLayout $panelContainer$inlined;
        final /* synthetic */ h.f.a.b $showInputCallback$inlined;
        final /* synthetic */ String $textPanel$inlined;

        static {
            Covode.recordClassIndex(79902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2, FrameLayout frameLayout, AVETParameter aVETParameter, h.f.a.b bVar, androidx.appcompat.app.d dVar) {
            super(1);
            this.$textPanel$inlined = str;
            this.$fontPanel$inlined = str2;
            this.$panelContainer$inlined = frameLayout;
            this.$etParams$inlined = aVETParameter;
            this.$showInputCallback$inlined = bVar;
            this.$appCompatActivity$inlined = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h.f.a.b<? super Boolean, ? extends z> bVar) {
            final h.f.a.b<? super Boolean, ? extends z> bVar2 = bVar;
            a.C0731a aVar = new a.C0731a(this.$appCompatActivity$inlined);
            aVar.f33402b = this.$appCompatActivity$inlined.getResources().getString(R.string.esz);
            aVar.b(this.$appCompatActivity$inlined.getResources().getString(R.string.a7u), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.servicimpl.ae.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79903);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    h.f.a.b bVar = bVar2;
                    if (bVar != null) {
                        bVar.invoke(false);
                    }
                }
            }, false).a(this.$appCompatActivity$inlined.getResources().getString(R.string.et0), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.servicimpl.ae.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(79904);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    h.f.a.b bVar = bVar2;
                    if (bVar != null) {
                        bVar.invoke(true);
                    }
                }
            }, false).a().c().show();
            return z.f158842a;
        }
    }

    private static String a(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        String uniqueVideoSessionDir = videoPublishEditModel.uniqueVideoSessionDir(sb.append(application.getFilesDir().toString()).append(File.separator).append("effect").append(File.separator).append("text_stickers").append(File.separator).append(System.currentTimeMillis()).append(File.separator).toString());
        l.b(uniqueVideoSessionDir, "");
        return uniqueVideoSessionDir;
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void a(boolean z, h.f.a.b<? super Boolean, z> bVar) {
        b bVar2 = new b(this, bVar);
        o oVar = this.f121849a;
        if (oVar == null) {
            bVar2.invoke(true);
        } else if (z || (oVar.f88562e.t() && oVar.f88562e.u())) {
            h.f.a.b<? super h.f.a.b<? super Boolean, z>, z> bVar3 = oVar.f88564g;
            if (bVar3 != null) {
                bVar3.invoke(new o.b(oVar, bVar2));
            }
        } else {
            oVar.f88562e.c(false);
            bVar2.invoke(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void b(boolean z, h.f.a.b<? super Boolean, z> bVar) {
        c cVar = new c(this, bVar);
        o oVar = this.f121849a;
        if (oVar == null) {
            cVar.invoke(true);
        } else if (z) {
            h.f.a.b<? super h.f.a.b<? super Boolean, z>, z> bVar2 = oVar.f88564g;
            if (bVar2 != null) {
                bVar2.invoke(new o.c(oVar, cVar));
            }
        } else {
            oVar.f88562e.c(false);
            cVar.invoke(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void a(BaseShortVideoContext baseShortVideoContext, boolean z, h.f.a.a<z> aVar) {
        l.d(baseShortVideoContext, "");
        e eVar = new e(this, aVar);
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            int[] b2 = f.b(videoPublishEditModel);
            o oVar = this.f121849a;
            if (oVar != null) {
                oVar.a(videoPublishEditModel.getCoverPublishModel().getEffectTextModel(), a(videoPublishEditModel), b2[0], b2[1], z, eVar);
            }
        }
        if (this.f121849a == null) {
            eVar.invoke();
            this.f121850b.d(new com.ss.android.ugc.aweme.editSticker.d.a(null, null, null, null, null, 0, z ? 1 : 0, 0, 191));
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void a(BaseShortVideoContext baseShortVideoContext, EffectTextModel effectTextModel, boolean z, boolean z2, h.f.a.a<z> aVar) {
        String a2;
        l.d(baseShortVideoContext, "");
        l.d(effectTextModel, "");
        d dVar = new d(this, z2, aVar);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        int[] b2 = f.b(videoPublishEditModel);
        o oVar = this.f121849a;
        if (oVar != null) {
            if (SettingsManager.a().a("tool_effect_text_cover_use_new_dir", true)) {
                a2 = videoPublishEditModel.uniqueVideoSessionDir(g.a().g().c().e("effect_text") + System.currentTimeMillis() + File.separator);
                l.b(a2, "");
            } else {
                a2 = a(videoPublishEditModel);
            }
            oVar.a(effectTextModel, a2, b2[0], b2[1], z, dVar);
        }
        if (this.f121849a == null) {
            dVar.invoke();
            this.f121850b.d(new com.ss.android.ugc.aweme.editSticker.d.a(null, null, null, null, null, 0, z ? 1 : 0, 0, 191));
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.bh
    public final void a(androidx.appcompat.app.d dVar, String str, String str2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, EffectTextModel effectTextModel, AVETParameter aVETParameter, h.f.a.b<? super Boolean, z> bVar) {
        MethodCollector.i(9075);
        l.d(dVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(frameLayout, "");
        l.d(frameLayout2, "");
        l.d(frameLayout3, "");
        o oVar = new o(dVar, frameLayout, frameLayout2, frameLayout3, effectTextModel);
        boolean b2 = com.bytedance.common.utility.l.b(frameLayout.getContext());
        l.d(str, "");
        l.d(str2, "");
        bz unused = kotlinx.coroutines.i.a((am) oVar.f88566i.getValue(), null, null, new o.k(oVar, str2, b2, str, null), 3);
        oVar.f88560c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewParent parent = oVar.f88560c.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(oVar.f88560c);
        }
        oVar.f88569l.addView(oVar.f88560c);
        oVar.f88563f = new com.ss.android.ugc.aweme.sticker.text.a(aVETParameter);
        oVar.f88562e.G = oVar.f88563f;
        oVar.f88565h = bVar;
        oVar.f88564g = new a(str, str2, frameLayout, aVETParameter, bVar, dVar);
        this.f121849a = oVar;
        MethodCollector.o(9075);
    }
}
