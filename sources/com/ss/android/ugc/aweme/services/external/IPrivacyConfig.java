package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ca;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.shortvideo.duet.b;
import java.util.List;

public interface IPrivacyConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface IPermissionModule {
        public static final Companion Companion = Companion.$$INSTANCE;

        static {
            Covode.recordClassIndex(79642);
        }

        boolean isEnablePublishExclusionExperiment();

        void onSaveInstanceState(Bundle bundle);

        void receivePermissionResult(int i2);

        void restoreSavedInstanceState(Bundle bundle);

        void setOnPermissionSetListener(ca caVar);

        void setupV2(ce ceVar, IPermissionPostCallback iPermissionPostCallback);

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            static {
                Covode.recordClassIndex(79643);
            }
        }
    }

    public interface IPermissionPostCallback {
        static {
            Covode.recordClassIndex(79644);
        }

        void doPostData(int i2);
    }

    public interface IPermissionSettingItem {
        static {
            Covode.recordClassIndex(79645);
        }

        View asView();

        TextView getPrivateHint();

        ImageView getPrivateIcon();

        void setAdvPromotable(boolean z);

        void setAllowRecommend(int i2);

        void setFromChangePrivacy(boolean z);

        void setMission(int i2, String str);

        void setPermission(int i2, List<? extends User> list, int i3);

        void setPermission(int i2, boolean z, String str);
    }

    static {
        Covode.recordClassIndex(79640);
    }

    b checkDuetReactPermission(String str, int i2);

    IPermissionModule createPermissionModule(Fragment fragment, IPermissionSettingItem iPermissionSettingItem, int i2, boolean z);

    IPermissionSettingItem createPermissionSettingItem(Context context);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79641);
        }
    }
}
