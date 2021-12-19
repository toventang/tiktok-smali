package com.ss.android.ugc.aweme.comment.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.QaStructConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.ss.android.ugc.aweme.setting.t;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f72878a = new u();

    public static final class a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f72879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f72880b;

        static {
            Covode.recordClassIndex(44891);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        a(Context context, RecordConfig.Builder builder) {
            this.f72879a = context;
            this.f72880b = builder;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f72879a, this.f72880b.build());
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f72881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f72882b;

        static {
            Covode.recordClassIndex(44892);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        b(Context context, RecordConfig.Builder builder) {
            this.f72881a = context;
            this.f72882b = builder;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f72881a, this.f72882b.build());
        }
    }

    private u() {
    }

    static {
        Covode.recordClassIndex(44890);
    }

    private static RecordConfig.Builder a(RecordConfig.Builder builder, String str) {
        String str2;
        EoyHighlightConfig eoyHighlightConfig = x.f123067b;
        if (eoyHighlightConfig != null) {
            str2 = eoyHighlightConfig.getEffectId();
        } else {
            str2 = null;
        }
        if (t.a(str) && str2 != null) {
            builder.autoUseSticker(str2).showPreloadingDialog(true).showCancelAfterPinProp(true).recordPresetResource(new RecordPresetResource(str2, null, null, null, 14, null));
        }
        return builder;
    }

    public static final void a(Context context, CommentVideoModel commentVideoModel) {
        String str;
        String shootWay;
        String str2 = "";
        l.d(context, str2);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        if (commentVideoModel == null || (str = commentVideoModel.getShootWay()) == null) {
            str = str2;
        }
        RecordConfig.Builder shootWay2 = builder.shootWay(str);
        CommentVideoConfig commentVideoConfig = new CommentVideoConfig();
        commentVideoConfig.setCommentVideoModel(commentVideoModel);
        RecordConfig.Builder CommentVideoConfig = shootWay2.CommentVideoConfig(commentVideoConfig);
        IExternalService a2 = AVExternalServiceImpl.a();
        if (!(commentVideoModel == null || (shootWay = commentVideoModel.getShootWay()) == null)) {
            str2 = shootWay;
        }
        a2.asyncService(context, str2, new a(context, CommentVideoConfig));
    }

    public static final void a(Context context, QaStruct qaStruct, String str, String str2, String str3) {
        String str4;
        l.d(context, "");
        l.d(str2, "");
        l.d(str3, "");
        RecordConfig.Builder enterMethod = new RecordConfig.Builder().shootWay(str3).enterFrom(str).enterMethod(str2);
        QaStructConfig qaStructConfig = new QaStructConfig();
        qaStructConfig.setQaStruct(qaStruct);
        RecordConfig.Builder qaVideoConfig = enterMethod.qaVideoConfig(qaStructConfig);
        if (qaStruct != null) {
            str4 = qaStruct.getQuestionContent();
        } else {
            str4 = null;
        }
        AVExternalServiceImpl.a().asyncService(context, str3, new b(context, a(qaVideoConfig, str4)));
    }
}
