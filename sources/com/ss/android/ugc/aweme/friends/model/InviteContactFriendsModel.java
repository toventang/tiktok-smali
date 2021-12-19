package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.f.a;
import com.ss.android.ugc.aweme.friends.invite.d;
import com.ss.android.ugc.aweme.friends.invite.e;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.au;
import com.ss.android.ugc.aweme.utils.bd;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.ik;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public class InviteContactFriendsModel extends a<Friend> {
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    public List<Integer> mIndexCounts;
    public List<String> mIndexLetters;
    private int scene;

    public interface IFetchShareConfigCallback {
        static {
            Covode.recordClassIndex(61587);
        }

        void onFailed();

        void onSuccess(e eVar);
    }

    public interface InviteFriendsCallback {
        static {
            Covode.recordClassIndex(61588);
        }

        void onFailed(String str);

        void onSuccess();
    }

    static {
        Covode.recordClassIndex(61576);
    }

    @Override // com.ss.android.ugc.aweme.friends.f.a
    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    public static class ContactFriend extends Friend {
        String firstName;
        String lastName;
        public int originIndex;
        public String section;
        String url;

        static {
            Covode.recordClassIndex(61586);
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getOriginIndex() {
            return this.originIndex;
        }

        @Override // com.ss.android.ugc.aweme.friends.model.Friend
        public String getSection() {
            return this.section;
        }

        public String getUrl() {
            return this.url;
        }

        @Override // com.ss.android.ugc.aweme.friends.model.Friend, com.ss.android.ugc.aweme.profile.model.User
        public int hashCode() {
            return super.hashCode();
        }

        public ContactFriend(String str) {
            super(str);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setOriginIndex(int i2) {
            this.originIndex = i2;
        }

        @Override // com.ss.android.ugc.aweme.friends.model.Friend
        public void setSection(String str) {
            this.section = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        @Override // com.ss.android.ugc.aweme.friends.model.Friend, com.ss.android.ugc.aweme.profile.model.User
        public boolean equals(Object obj) {
            if (!(obj instanceof ContactFriend)) {
                return false;
            }
            Friend friend = (Friend) obj;
            if (!TextUtils.equals(getSocialName(), friend.getSocialName()) || !TextUtils.equals(getNickname(), friend.getNickname())) {
                return false;
            }
            return true;
        }
    }

    public InviteContactFriendsModel(String str) {
        this(str, 1);
    }

    public void fetchShareConfig(IFetchShareConfigCallback iFetchShareConfigCallback) {
        i.b(new InviteContactFriendsModel$$Lambda$6(this, iFetchShareConfigCallback), i.f4824a);
    }

    public d shortenUrl(String str) {
        return com.ss.android.ugc.aweme.friends.api.a.a().shortenUrl(str).get();
    }

    static final /* synthetic */ i lambda$fetchList$0$InviteContactFriendsModel(i iVar) {
        if (!iVar.c()) {
            iVar.getClass();
            return i.b(InviteContactFriendsModel$$Lambda$8.get$Lambda(iVar), i.f4824a);
        }
        throw iVar.e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchShareConfig$7$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback) {
        try {
            e eVar = com.ss.android.ugc.aweme.friends.api.a.a().getInviteContactFriendsSettings().get();
            if (eVar != null) {
                this.mHandler.post(new InviteContactFriendsModel$$Lambda$7(iFetchShareConfigCallback, eVar));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void encodeAndAddToCache(bd bdVar) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        this.hashContactsMap.clear();
        int i2 = 0;
        for (ContactModelV2 contactModelV2 : bdVar.f142666a) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    contactModel.url = contactModelV2.mImageUrl;
                    contactModel.firstName = contactModelV2.givenName;
                    contactModel.lastName = contactModelV2.familyName;
                    contactModel.originIndex = i2;
                    contactModel.mSection = contactModelV2.section;
                    contactModel.photoUri = contactModelV2.photoUri;
                    this.hashContactsMap.put(com.bytedance.common.utility.d.a(instance.digest(ik.a(str).getBytes(StandardCharsets.UTF_8))) + com.bytedance.common.utility.d.a(instance.digest(str2.getBytes(StandardCharsets.UTF_8))), contactModel);
                }
            }
            i2++;
        }
    }

    private void filterInvalidVal(List<ContactModelV2> list) {
        Iterator<ContactModelV2> it = list.iterator();
        while (it.hasNext()) {
            ContactModelV2 next = it.next();
            if (m.a(next.name) || next.phoneNumber.isEmpty()) {
                it.remove();
            } else {
                Iterator<String> it2 = next.phoneNumber.iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    try {
                        if (m.a(next2)) {
                            it2.remove();
                        } else if (next2.charAt(0) == '+') {
                            if (!PhoneNumberUtil.getInstance().isPossibleNumber(next2, null)) {
                                it2.remove();
                            }
                        } else if (next2.length() < 2 || next2.length() > 17 || !next2.matches("[0-9.-]+")) {
                            it2.remove();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (next.phoneNumber.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    private void sortWithContactIndex(List<ContactFriend> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ContactFriend> it = list.iterator();
        while (it.hasNext()) {
            ContactFriend next = it.next();
            if (TextUtils.equals(next.section, "#") || TextUtils.equals(next.section, "…") || next.section == null || TextUtils.isEmpty(next.section.trim())) {
                it.remove();
                next.setSection("#");
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, InviteContactFriendsModel$$Lambda$4.$instance);
        Collections.sort(list, InviteContactFriendsModel$$Lambda$5.$instance);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ContactFriend contactFriend : list) {
            if (contactFriend != null) {
                String section = contactFriend.getSection();
                if (!linkedHashMap.containsKey(section)) {
                    linkedHashMap.put(section, 1);
                } else {
                    linkedHashMap.put(section, Integer.valueOf(((Integer) linkedHashMap.get(section)).intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            arrayList2.add(obj);
            arrayList3.add(linkedHashMap.get(obj));
        }
        this.mIndexLetters = arrayList2;
        this.mIndexCounts = arrayList3;
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$5$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        return contactFriend.originIndex - contactFriend2.originIndex;
    }

    static final /* synthetic */ void lambda$null$6$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback, e eVar) {
        if (iFetchShareConfigCallback == null) {
            return;
        }
        if (eVar != null) {
            iFetchShareConfigCallback.onSuccess(eVar);
        } else {
            iFetchShareConfigCallback.onFailed();
        }
    }

    static final /* synthetic */ FriendList lambda$uploadContacts$3$InviteContactFriendsModel(com.ss.android.ugc.aweme.social.monitor.d dVar, i iVar) {
        if (iVar.c()) {
            dVar.a(iVar.e());
            dVar.g();
        }
        return (FriendList) iVar.d();
    }

    public InviteContactFriendsModel(String str, int i2) {
        this.scene = 1;
        this.hashContactsMap = new HashMap<>();
        this.mIndexLetters = new ArrayList();
        this.mIndexCounts = new ArrayList();
        this.friendApi = (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(FriendApi.class);
        this.scene = i2;
    }

    private void sort(bd bdVar, List<ContactFriend> list) {
        if (!b.a((Collection) list)) {
            if (bdVar.f142668c == null || bdVar.f142667b == null) {
                if (en.b()) {
                    for (ContactFriend contactFriend : list) {
                        contactFriend.setSection(au.a(contactFriend.getNickname()));
                    }
                } else {
                    return;
                }
            }
            sortWithContactIndex(list);
        }
    }

    public i<FriendList<ContactFriend>> uploadContacts(boolean z, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        com.ss.android.ugc.aweme.social.monitor.d a2 = com.ss.android.ugc.aweme.social.monitor.e.f133706b.a(i2, UUID.randomUUID());
        return i.b(new InviteContactFriendsModel$$Lambda$1(this, a2, atomicReference, z, i2), i.f4824a).c(new InviteContactFriendsModel$$Lambda$2(this, a2, atomicReference)).a((g) new InviteContactFriendsModel$$Lambda$3(a2));
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$4$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        int i2;
        int i3;
        char charAt = contactFriend.getNickname().toLowerCase().charAt(0);
        char charAt2 = contactFriend2.getNickname().toLowerCase().charAt(0);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                return 1;
            }
            if (charAt < '0' || charAt > '9') {
                if (charAt2 >= '0' && charAt2 <= '9') {
                    return 1;
                }
                i2 = contactFriend.originIndex;
                i3 = contactFriend2.originIndex;
            } else if (charAt2 < '0' || charAt2 > '9') {
                return -1;
            } else {
                return charAt - charAt2;
            }
        } else if (charAt2 < 'a' || charAt2 > 'z') {
            return -1;
        } else {
            i2 = contactFriend.originIndex;
            i3 = contactFriend2.originIndex;
        }
        return i2 - i3;
    }

    @Override // com.ss.android.ugc.aweme.friends.f.a
    public void fetchList(int i2, int i3, int i4) {
        uploadContacts(false, this.scene).b(InviteContactFriendsModel$$Lambda$0.$instance).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$2$InviteContactFriendsModel(com.ss.android.ugc.aweme.social.monitor.d dVar, AtomicReference atomicReference, i iVar) {
        ArrayList arrayList;
        dVar.e();
        List<ContactModel> list = ((UploadContactsResult) iVar.d()).contacts;
        if (!b.a((Collection) list)) {
            arrayList = new ArrayList(list.size());
            int i2 = 0;
            for (ContactModel contactModel : list) {
                ContactModel contactModel2 = this.hashContactsMap.get(contactModel.phoneNumber + contactModel.name);
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                    ContactFriend contactFriend = new ContactFriend(contactModel.phoneNumber);
                    contactFriend.setNickname(contactModel.name);
                    contactFriend.setFirstName(contactModel2.firstName);
                    contactFriend.setLastName(contactModel2.lastName);
                    contactFriend.setOriginIndex(contactModel2.originIndex);
                    contactFriend.setSection(contactModel2.mSection);
                    contactFriend.setPhotoUri(contactModel2.photoUri);
                    String str = contactModel2.url;
                    if (!m.a(str)) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setHeight(-1);
                        urlModel.setWidth(-1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str);
                        urlModel.setUrlList(arrayList2);
                        contactFriend.setAvatarThumb(urlModel);
                    }
                    if (!arrayList.contains(contactFriend)) {
                        if (!com.ss.android.ugc.aweme.friends.d.a.b(contactModel.phoneNumber)) {
                            contactFriend.setInvited(true);
                            arrayList.add(contactFriend);
                        } else {
                            arrayList.add(i2, contactFriend);
                            i2++;
                        }
                    }
                }
            }
        } else {
            arrayList = null;
        }
        FriendList friendList = new FriendList();
        sort((bd) atomicReference.get(), arrayList);
        friendList.setFriends(arrayList);
        dVar.f();
        dVar.g();
        return friendList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$1$InviteContactFriendsModel(com.ss.android.ugc.aweme.social.monitor.d dVar, AtomicReference atomicReference, boolean z, int i2) {
        dVar.a();
        atomicReference.set(be.a(com.bytedance.ies.ugc.appcontext.d.a(), dVar, "sort_key", true, false, z));
        List<ContactModelV2> list = ((bd) atomicReference.get()).f142666a;
        filterInvalidVal(list);
        dVar.b();
        if (b.a((Collection) list)) {
            return new UploadContactsResult();
        }
        encodeAndAddToCache((bd) atomicReference.get());
        dVar.c();
        if (b.a((Collection) list)) {
            return new UploadContactsResult();
        }
        return UploadContactsApi.a(list, dVar, 1, i2);
    }
}
