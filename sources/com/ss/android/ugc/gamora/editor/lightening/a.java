package com.ss.android.ugc.gamora.editor.lightening;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shoutouts.d;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146013a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(95963);
    }

    public static boolean b() {
        if (!a()) {
            return false;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getStoryService().b();
    }

    public static boolean a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e() || g.a().A().a()) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (!a()) {
            return false;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().c()) {
            return true;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin2, "");
        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().d()) {
            return true;
        }
        return false;
    }

    public static boolean b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isCommentReply() || c(videoPublishEditModel)) {
            return false;
        }
        Boolean bool = videoPublishEditModel.hasQaSticker;
        l.b(bool, "");
        if (bool.booleanValue()) {
            return false;
        }
        return true;
    }

    private static boolean d(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge aVChallenge;
        c cVar = cr.a().f125295a;
        if (!(cVar == null || (aVChallenge = cVar.challenge) == null || !aVChallenge.isCommerce)) {
            return true;
        }
        List<AVChallenge> list = videoPublishEditModel.challenges;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (AVChallenge aVChallenge2 : list) {
                if (aVChallenge2.isCommerce) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (a() && !videoPublishEditModel.isShoutout() && !l.a((Object) videoPublishEditModel.mShootWay, (Object) d.shootWay) && !bp.j(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static boolean c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        cr a2 = cr.a();
        l.b(a2, "");
        if (!a2.c() && !d(videoPublishEditModel) && com.ss.android.ugc.aweme.port.in.l.f115658a.z().a(videoPublishEditModel.commerceData) == null && !l.a((Object) videoPublishEditModel.mShootWay, (Object) "tcm_upload")) {
            return false;
        }
        return true;
    }
}
