package com.ss.android.ugc.aweme.services.publish;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;
import java.util.List;

public interface IAVPublishExtension<T> {

    public interface Callback {
        static {
            Covode.recordClassIndex(79774);
        }

        void onContentModified();
    }

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79775);
        }

        public static <T> void callbackAnchors(IAVPublishExtension<T> iAVPublishExtension, List<CreateAnchorInfo> list) {
            l.d(list, "");
        }

        public static <T> UrlModel getAnchorIconUrl(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> ViewGroup getAnchorListContent(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> String getAnchorText(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> void onActivityResult(IAVPublishExtension<T> iAVPublishExtension, int i2, int i3, Intent intent) {
        }

        public static <T> void onBackPressed(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            l.d(publishOutput, "");
        }

        public static <T> void onCreateFinish(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onPublish(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            l.d(publishOutput, "");
        }

        public static <T> void onRequestPermissionsResult(IAVPublishExtension<T> iAVPublishExtension, int i2, String[] strArr, int[] iArr) {
            l.d(strArr, "");
            l.d(iArr, "");
        }

        public static <T> void onResume(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onSaveDraft(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            l.d(publishOutput, "");
        }

        public static <T> void onSaveInstanceState(IAVPublishExtension<T> iAVPublishExtension, Bundle bundle) {
            l.d(bundle, "");
        }

        public static <T> void setLeftIcon(IAVPublishExtension<T> iAVPublishExtension, int i2) {
        }

        public static <T> void setRightIcon(IAVPublishExtension<T> iAVPublishExtension, a aVar) {
            l.d(aVar, "");
        }
    }

    static {
        Covode.recordClassIndex(79773);
    }

    void callbackAnchors(List<CreateAnchorInfo> list);

    UrlModel getAnchorIconUrl();

    ViewGroup getAnchorListContent();

    String getAnchorText();

    String getName();

    void onActivityResult(int i2, int i3, Intent intent);

    void onBackPressed(PublishOutput publishOutput);

    void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback);

    void onCreateFinish();

    void onDestroy();

    void onEnterChildrenMode();

    void onPublish(PublishOutput publishOutput);

    void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);

    void onResume();

    void onSaveDraft(PublishOutput publishOutput);

    void onSaveInstanceState(Bundle bundle);

    T provideExtensionData();

    void setLeftIcon(int i2);

    void setRightIcon(a aVar);
}
