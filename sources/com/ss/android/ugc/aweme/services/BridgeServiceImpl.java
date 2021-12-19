package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.security.d;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.profile.experiment.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.e;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.au;
import com.ss.android.ugc.aweme.profile.ui.u;
import com.ss.android.ugc.aweme.profile.ui.v2.b;
import com.ss.android.ugc.aweme.profile.ui.v2.i;
import com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask;
import com.ss.android.ugc.aweme.recommend.o;
import com.ss.android.ugc.aweme.recommend.p;
import com.ss.android.ugc.aweme.share.am;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class BridgeServiceImpl implements e {
    static {
        Covode.recordClassIndex(79436);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void checkToTransformMusDraft() {
    }

    public final u createUserProfileEditFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final a createMyProfileFragment() {
        return new b();
    }

    public final a createUserProfileFragment() {
        return new i();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final boolean needShowSafeInfoNotice() {
        return d.a.a();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void onFeedStop() {
        g.a.f99786a.f99780b = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final f getBulletABHelper() {
        return (com.ss.android.ugc.aweme.bullet.ab.a) com.ss.android.ugc.aweme.bullet.ab.a.f68835a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final boolean shouldShowI18nRecommendUserDialogOnMyPrifile() {
        if (!o.c() || !RecommendUserDialogTask.f120047b.get() || !p.a()) {
            return false;
        }
        return true;
    }

    public final void setCustomStatusBarInLayout(Activity activity) {
        com.ss.android.ugc.aweme.base.utils.o.a(activity);
        com.ss.android.ugc.aweme.base.utils.o.b(activity);
    }

    public final void switchToSignature(Activity activity) {
        ProfileEditActivity.a(activity, (Bundle) null);
    }

    public final void openWallet(Activity activity) {
        l.d(activity, "");
        com.ss.android.ugc.aweme.dg.a.a(activity, "page_index");
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void enterMyFavorites(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
        SmartRouter.buildRoute(activity, "//favorite").withParam(bundle).open();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void switchToBioUrl(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        SmartRouter.buildRoute(activity, "//profile/edit_bio").withParam("bio_url", str).open();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void startThirdSocialActivity(Context context, User user, int i2) {
        String twitterId;
        l.d(context, "");
        l.d(user, "");
        if (i2 == 1) {
            String insId = user.getInsId();
            if (insId != null && !insId.isEmpty()) {
                l.d(context, "");
                l.d(insId, "");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("instagram://user?username=".concat(String.valueOf(insId))));
                intent.setPackage("com.instagram.android");
                Intent intent2 = new Intent(context, CrossPlatformActivity.class);
                intent2.putExtra("title", context.getString(R.string.cnm));
                intent2.setData(Uri.parse("https://instagram.com/_u/".concat(String.valueOf(insId))));
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    am.a(context, intent2);
                    return;
                }
                try {
                    am.a(context, intent);
                } catch (ActivityNotFoundException unused) {
                    am.a(context, intent2);
                }
            }
        } else if (i2 == 2) {
            String youtubeChannelId = user.getYoutubeChannelId();
            if (youtubeChannelId != null && !youtubeChannelId.isEmpty()) {
                l.d(context, "");
                l.d(youtubeChannelId, "");
                Uri parse = Uri.parse("https://www.youtube.com/channel/".concat(String.valueOf(youtubeChannelId)));
                Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                intent3.setPackage("com.google.android.youtube");
                Intent intent4 = new Intent(context, CrossPlatformActivity.class);
                intent4.putExtra("title", context.getString(R.string.hfy));
                intent4.setData(parse);
                if (intent3.resolveActivity(context.getPackageManager()) == null) {
                    am.a(context, intent4);
                    return;
                }
                try {
                    am.a(context, intent3);
                } catch (ActivityNotFoundException unused2) {
                    am.a(context, intent4);
                }
            }
        } else if (i2 == 3 && (twitterId = user.getTwitterId()) != null && !twitterId.isEmpty()) {
            l.d(context, "");
            l.d(twitterId, "");
            Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?id=".concat(String.valueOf(twitterId))));
            intent5.setPackage("com.twitter.android");
            Intent intent6 = new Intent(context, CrossPlatformActivity.class);
            intent6.putExtra("title", context.getString(R.string.h0b));
            intent6.setData(Uri.parse("https://twitter.com/intent/user?user_id=".concat(String.valueOf(twitterId))));
            if (intent5.resolveActivity(context.getPackageManager()) == null) {
                am.a(context, intent6);
                return;
            }
            try {
                am.a(context, intent5);
            } catch (ActivityNotFoundException unused3) {
                am.a(context, intent6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final aq createAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3) {
        return au.a(i2, i3, str, str2, z, z2, new Bundle());
    }
}
