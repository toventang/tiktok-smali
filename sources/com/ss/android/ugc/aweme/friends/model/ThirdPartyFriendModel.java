package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.f.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.social.monitor.d;
import com.ss.android.ugc.aweme.social.monitor.e;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.ik;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class ThirdPartyFriendModel extends a<Friend> {
    private static Set<String> invitedContacts;
    private final String accessToken;
    private final Long expireTime;
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    private HashMap<String, String> hashSocialMap;
    public Boolean isNewStyle;
    private final String platform;
    private final int scene;
    private final String secretAccessToken;

    static {
        Covode.recordClassIndex(61614);
    }

    @Override // com.ss.android.ugc.aweme.friends.f.a
    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    public i<FriendList<Friend>> uploadHashedContacts() {
        return uploadContacts();
    }

    private i<FriendList<Friend>> uploadContacts() {
        d a2 = e.f133706b.a(this.scene, UUID.randomUUID());
        return i.b(new ThirdPartyFriendModel$$Lambda$2(this, a2), i.f4824a).c(new ThirdPartyFriendModel$$Lambda$3(this, a2)).a((g) new ThirdPartyFriendModel$$Lambda$4(a2));
    }

    public ThirdPartyFriendModel(String str) {
        this(str, null, null);
    }

    static final /* synthetic */ i lambda$fetchList$0$ThirdPartyFriendModel(i iVar) {
        if (!iVar.c()) {
            iVar.getClass();
            return i.b(ThirdPartyFriendModel$$Lambda$5.get$Lambda(iVar), i.f4824a);
        }
        throw iVar.e();
    }

    private void handleReqId(FriendList<Friend> friendList) {
        if (!(friendList == null || friendList.getFriends() == null)) {
            for (Friend friend : friendList.getFriends()) {
                if (friendList.getLogPbBean() != null) {
                    friend.setRequestId(friendList.getLogPbBean().getImprId());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchList$1$ThirdPartyFriendModel(i iVar) {
        handleReqId((FriendList) iVar.d());
        ((FriendList) iVar.d()).setFriends(sortByFollowStatus(((FriendList) iVar.d()).getFriends()));
        return iVar.d();
    }

    private <T extends User> List<Friend> sortByFollowStatus(List<T> list) {
        if (b.a((Collection) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (T t : list) {
            if (t.getFollowStatus() == 0) {
                arrayList.add(i2, Friend.copyFrom(t));
                i2++;
            } else if (t.getFollowStatus() == 4) {
                arrayList.add(i3, Friend.copyFrom(t));
            } else if (t.getFollowStatus() == 1) {
                arrayList.add(i4, Friend.copyFrom(t));
                i4++;
            } else {
                arrayList.add(Friend.copyFrom(t));
            }
            i3++;
            i4++;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$2$ThirdPartyFriendModel(d dVar) {
        dVar.a();
        List<ContactModelV2> a2 = be.a(com.bytedance.ies.ugc.appcontext.d.a(), dVar, false);
        if (b.a((Collection) a2)) {
            return new UploadContactsResult();
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (ContactModelV2 contactModelV2 : a2) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    this.hashContactsMap.put(com.bytedance.common.utility.d.a(instance.digest(ik.a(str).getBytes(StandardCharsets.UTF_8))) + com.bytedance.common.utility.d.a(instance.digest(str2.getBytes(StandardCharsets.UTF_8))), new ContactModel(str, str2));
                }
            }
        }
        dVar.c();
        return UploadContactsApi.a(a2, dVar, 1, this.scene);
    }

    public ThirdPartyFriendModel(String str, int i2) {
        this(str, null, null, null, i2);
    }

    static final /* synthetic */ FriendList lambda$uploadContacts$4$ThirdPartyFriendModel(d dVar, i iVar) {
        if (iVar.c()) {
            dVar.a(iVar.e());
            dVar.g();
        }
        return (FriendList) iVar.d();
    }

    private List<Friend> insertUnRegisteredContacts(List<Friend> list, List<Friend> list2) {
        if (b.a((Collection) list2)) {
            return list;
        }
        if (b.a((Collection) list)) {
            return list2;
        }
        int i2 = 0;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (list.get(size).getFollowStatus() == 0) {
                i2 = size + 1;
                break;
            } else {
                size--;
            }
        }
        list.addAll(i2, list2);
        return list;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$3$ThirdPartyFriendModel(d dVar, i iVar) {
        String imprId;
        ArrayList arrayList;
        dVar.e();
        UploadContactsResult uploadContactsResult = (UploadContactsResult) iVar.d();
        if (((UploadContactsResult) iVar.d()).logPbBean == null) {
            imprId = "";
        } else {
            imprId = ((UploadContactsResult) iVar.d()).logPbBean.getImprId();
        }
        List<ContactModel> list = uploadContactsResult.contacts;
        if (!b.a((Collection) list)) {
            arrayList = new ArrayList(list.size());
            int i2 = 0;
            for (ContactModel contactModel : list) {
                ContactModel contactModel2 = this.hashContactsMap.get(contactModel.phoneNumber + contactModel.name);
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                    Friend friend = new Friend(contactModel.phoneNumber);
                    friend.setRequestId(imprId);
                    friend.setNickname(contactModel.name);
                    if (!com.ss.android.ugc.aweme.friends.d.a.b(contactModel.phoneNumber)) {
                        friend.setInvited(true);
                        arrayList.add(friend);
                    } else {
                        arrayList.add(i2, friend);
                        i2++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        List<Friend> sortByFollowStatus = sortByFollowStatus(uploadContactsResult.users);
        if (sortByFollowStatus != null) {
            for (Friend friend2 : sortByFollowStatus) {
                friend2.setRequestId(imprId);
            }
        }
        FriendList friendList = new FriendList();
        friendList.setFriends(insertUnRegisteredContacts(sortByFollowStatus, arrayList));
        SharePrefCache.inst().getIsContactsUploaded().b(true);
        dVar.f();
        dVar.g();
        return friendList;
    }

    public ThirdPartyFriendModel(String str, String str2, String str3) {
        this(str, str2, str3, null, 1);
    }

    @Override // com.ss.android.ugc.aweme.friends.f.a
    public void fetchList(int i2, int i3, int i4) {
        if (this.platform.equals("contact")) {
            uploadContacts().b(ThirdPartyFriendModel$$Lambda$0.$instance).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        } else {
            this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken, this.expireTime, Integer.valueOf(this.scene)).c(new ThirdPartyFriendModel$$Lambda$1(this)).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        }
    }

    public ThirdPartyFriendModel(String str, String str2, String str3, Long l2, int i2) {
        this.isNewStyle = false;
        this.hashContactsMap = new HashMap<>();
        this.hashSocialMap = new HashMap<>();
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.expireTime = l2;
        this.scene = i2;
        this.friendApi = (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(FriendApi.class);
    }
}
