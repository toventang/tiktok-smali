package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class RelationLabelHelper {
    public static final RelationLabelHelper INSTANCE = new RelationLabelHelper();

    private RelationLabelHelper() {
    }

    static {
        Covode.recordClassIndex(59448);
    }

    public static final boolean hasNewFollowRelationLabel(Integer num) {
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewRelationLabel(Aweme aweme) {
        if (aweme == null || aweme.feedRelationLabel == null) {
            return false;
        }
        return true;
    }

    public static final boolean hasNewFollowRelationLabel(Aweme aweme) {
        Integer num;
        RelationLabelNew relationLabelNew;
        if (aweme == null || (relationLabelNew = aweme.feedRelationLabel) == null) {
            num = null;
        } else {
            num = relationLabelNew.getType();
        }
        return hasNewFollowRelationLabel(num);
    }

    public static final boolean hasNewInteractiveRelationLabel(Aweme aweme) {
        Integer num;
        RelationLabelNew relationLabelNew;
        if (aweme == null || (relationLabelNew = aweme.feedRelationLabel) == null) {
            num = null;
        } else {
            num = relationLabelNew.getType();
        }
        return hasNewInteractiveRelationLabel(num);
    }

    public static final User convertLabelUser2user(RelationLabelUser relationLabelUser) {
        l.d(relationLabelUser, "");
        User user = new User();
        user.setUid(String.valueOf(relationLabelUser.getUid()));
        user.setSecUid(relationLabelUser.getSecUid());
        user.setNickname(relationLabelUser.getNickName());
        user.setRemarkName(relationLabelUser.getRemarkName());
        user.setAvatarLarger(relationLabelUser.getAvatarLarger());
        user.setAvatarThumb(relationLabelUser.getAvatarThumb());
        user.setFollowStatus(relationLabelUser.getFollowStatus());
        return user;
    }

    public static final List<User> convertLabelUsers2Users(List<RelationLabelUser> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelationLabelUser relationLabelUser : list) {
            arrayList.add(convertLabelUser2user(relationLabelUser));
        }
        return arrayList;
    }

    public static final boolean hasCommentId(Aweme aweme) {
        Integer num;
        RelationLabelNew feedRelationLabel;
        RelationLabelExtra extra;
        String cid;
        RelationLabelNew feedRelationLabel2;
        if (aweme == null || (feedRelationLabel2 = aweme.getFeedRelationLabel()) == null) {
            num = null;
        } else {
            num = feedRelationLabel2.getType();
        }
        if (num == null || num.intValue() != 3 || aweme == null || (feedRelationLabel = aweme.getFeedRelationLabel()) == null || (extra = feedRelationLabel.getExtra()) == null || (cid = extra.getCid()) == null || cid.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean hasNewInteractiveRelationLabel(Integer num) {
        if (num == null) {
            return false;
        }
        if (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 22 || num.intValue() == 5) {
            return true;
        }
        return false;
    }

    public static final boolean hasDuoShanLabel(Aweme aweme) {
        List<AwemeLabelModel> videoLabels;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Integer showFromDuoshanLabel = iESSettingsProxy.getShowFromDuoshanLabel();
            if (showFromDuoshanLabel != null) {
                if (showFromDuoshanLabel.intValue() != 1 || aweme == null || (videoLabels = aweme.getVideoLabels()) == null || ((videoLabels instanceof Collection) && videoLabels.isEmpty())) {
                    return false;
                }
                for (T t : videoLabels) {
                    if (t != null && t.labelType == 100) {
                        return true;
                    }
                }
                return false;
            }
        } catch (a e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static final RelationLabelNew mockStarCommentLabel(User user) {
        l.d(user, "");
        RelationLabelNew relationLabelNew = new RelationLabelNew();
        relationLabelNew.setType(4);
        ArrayList arrayList = new ArrayList();
        RelationLabelUser relationLabelUser = new RelationLabelUser();
        String uid = user.getUid();
        l.b(uid, "");
        relationLabelUser.setUid(Long.parseLong(uid));
        relationLabelUser.setSecUid(user.getSecUid());
        relationLabelUser.setNickName(user.getNickname());
        relationLabelUser.setRemarkName(user.getRemarkName());
        relationLabelUser.setAvatarLarger(user.getAvatarLarger());
        relationLabelUser.setAvatarThumb(user.getAvatarThumb());
        relationLabelUser.setFollowStatus(user.getFollowStatus());
        arrayList.add(relationLabelUser);
        relationLabelNew.setUserList(arrayList);
        return relationLabelNew;
    }
}
