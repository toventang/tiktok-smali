package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.n;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.utils.fa;
import f.a.t;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

public final class ReadTextViewModel extends BaseJediViewModel<ReadTextState> {

    /* renamed from: a  reason: collision with root package name */
    public final h f146817a = i.a(new ReadTextApi());

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f146818b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public long f146819c;

    static {
        Covode.recordClassIndex(96701);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ReadTextState(aq.f39400a, null, null);
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadTextViewModel f146827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f146828b;

        static {
            Covode.recordClassIndex(96706);
        }

        public e(ReadTextViewModel readTextViewModel, String str) {
            this.f146827a = readTextViewModel;
            this.f146828b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f146827a.a(this.f146828b, -1);
        }
    }

    public final void a(com.bytedance.jedi.arch.d<TextStickerData> dVar) {
        l.d(dVar, "");
        c(new f(dVar));
    }

    static final class f extends m implements h.f.a.b<ReadTextState, ReadTextState> {
        final /* synthetic */ com.bytedance.jedi.arch.d $textStickerData;

        static {
            Covode.recordClassIndex(96707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.bytedance.jedi.arch.d dVar) {
            super(1);
            this.$textStickerData = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState) {
            ReadTextState readTextState2 = readTextState;
            l.d(readTextState2, "");
            return ReadTextState.copy$default(readTextState2, null, this.$textStickerData, null, 5, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<ReadTextState, ReadTextState> {
        final /* synthetic */ int $errorCode;
        final /* synthetic */ String $msg;

        static {
            Covode.recordClassIndex(96702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, int i2) {
            super(1);
            this.$msg = str;
            this.$errorCode = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState) {
            ReadTextState readTextState2 = readTextState;
            l.d(readTextState2, "");
            return ReadTextState.copy$default(readTextState2, null, null, new n(v.a(this.$msg, Integer.valueOf(this.$errorCode))), 3, null);
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f146820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextStickerData f146821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f146822c;

        static {
            Covode.recordClassIndex(96703);
        }

        b(String str, TextStickerData textStickerData, String str2) {
            this.f146820a = str;
            this.f146821b = textStickerData;
            this.f146822c = str2;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<TextStickerData> vVar) {
            l.d(vVar, "");
            File b2 = i.b(this.f146820a);
            if (b2 == null || !b2.exists()) {
                vVar.b(new IllegalStateException("File not exists"));
                return;
            }
            this.f146821b.setAudioTrackDuration(fa.a(b2.getAbsolutePath()));
            this.f146821b.setAudioTrackFilePath(b2.getAbsolutePath());
            List<String> audioPathList = this.f146821b.getAudioPathList();
            String absolutePath = b2.getAbsolutePath();
            l.b(absolutePath, "");
            audioPathList.add(absolutePath);
            this.f146821b.setAudioText(this.f146822c);
            if (!vVar.isDisposed()) {
                vVar.a(this.f146821b);
                vVar.a();
            }
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadTextViewModel f146823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextStickerData f146824b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f146825c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f146826d;

        static {
            Covode.recordClassIndex(96705);
        }

        public d(ReadTextViewModel readTextViewModel, TextStickerData textStickerData, String str, String str2) {
            this.f146823a = readTextViewModel;
            this.f146824b = textStickerData;
            this.f146825c = str;
            this.f146826d = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) obj;
            if (fetchTextAudioResponse.status_code == 0 && fetchTextAudioResponse.getData() != null) {
                String audio = fetchTextAudioResponse.getData().getAudio();
                if (audio != null && audio.length() > 0) {
                    ReadTextViewModel readTextViewModel = this.f146823a;
                    t<T> a2 = t.a(new b(audio, this.f146824b, this.f146825c)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                    l.b(a2, "");
                    readTextViewModel.f146818b.a(readTextViewModel.a(a2, new c(readTextViewModel)));
                }
            } else if (fetchTextAudioResponse.status_code != 0) {
                ReadTextViewModel readTextViewModel2 = this.f146823a;
                String str = fetchTextAudioResponse.message;
                if (str == null) {
                    str = this.f146826d;
                }
                readTextViewModel2.a(str, fetchTextAudioResponse.status_code);
            }
        }
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis - this.f146819c);
        q.a("edit_text_read_request", jSONObject, new ar().a("code", Integer.valueOf(i2)).a());
        c(new a(str, i2));
    }

    static final class c extends m implements h.f.a.m<ReadTextState, com.bytedance.jedi.arch.a<? extends TextStickerData>, ReadTextState> {
        final /* synthetic */ ReadTextViewModel this$0;

        static {
            Covode.recordClassIndex(96704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReadTextViewModel readTextViewModel) {
            super(2);
            this.this$0 = readTextViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState, com.bytedance.jedi.arch.a<? extends TextStickerData> aVar) {
            ReadTextState readTextState2 = readTextState;
            com.bytedance.jedi.arch.a<? extends TextStickerData> aVar2 = aVar;
            l.d(readTextState2, "");
            l.d(aVar2, "");
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", currentTimeMillis - this.this$0.f146819c);
            q.a("edit_text_read_request", jSONObject, new ar().a("code", (Integer) 0).a());
            return ReadTextState.copy$default(readTextState2, aVar2, null, null, 6, null);
        }
    }
}
