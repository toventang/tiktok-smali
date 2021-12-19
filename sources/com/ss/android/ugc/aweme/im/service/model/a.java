package com.ss.android.ugc.aweme.im.service.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.z;
import java.io.Serializable;

public final class a implements Serializable {
    public static final b Companion = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private transient Context f103880a;

    /* renamed from: b  reason: collision with root package name */
    private transient String f103881b;
    private String buttonType;

    /* renamed from: c  reason: collision with root package name */
    private transient h.f.a.b<? super Boolean, z> f103882c;
    private Serializable chatExt;
    private int chatType;
    private int enterFrom;
    private String enterFromForMob;
    private String enterFromSubPage;
    private String enterMethodForMob;
    private boolean enterSelectChatMsgActivity;
    private int followStatus;
    private String groupId;
    private boolean hasUnreadDot;
    private e imAdLog;
    private IMContact imContact;
    private IMUser imUser;
    private boolean isStickyTop;
    private boolean keepEnterFrom;
    private boolean noEvent;
    private int selectMsgType;
    private String sessionId;
    private String shareUserId;
    private String storyCollectionId;
    private String storyType;
    private int unreadCount;

    static {
        Covode.recordClassIndex(66558);
    }

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static final C2643a newBuilder(Context context, int i2, String str) {
        return b.a(context, i2, str);
    }

    public static final C2643a newBuilder(Context context, IMContact iMContact) {
        return b.a(context, iMContact);
    }

    public static final C2643a newBuilder(Context context, IMUser iMUser) {
        return b.a(context, iMUser);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66560);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static C2643a a(Context context, IMContact iMContact) {
            return new C2643a().a(iMContact).a(context);
        }

        public static C2643a a(Context context, IMUser iMUser) {
            return new C2643a().a(iMUser).a(context);
        }

        public static C2643a a(Context context, int i2, String str) {
            return new C2643a().a(str).b(i2).a(context);
        }
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final Serializable getChatExt() {
        return this.chatExt;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final Context getContext() {
        return this.f103880a;
    }

    public final int getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterFromForMob() {
        return this.enterFromForMob;
    }

    public final String getEnterFromSubPage() {
        return this.enterFromSubPage;
    }

    public final String getEnterMethodForMob() {
        return this.enterMethodForMob;
    }

    public final boolean getEnterSelectChatMsgActivity() {
        return this.enterSelectChatMsgActivity;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean getHasUnreadDot() {
        return this.hasUnreadDot;
    }

    public final e getImAdLog() {
        return this.imAdLog;
    }

    public final IMContact getImContact() {
        return this.imContact;
    }

    public final IMUser getImUser() {
        return this.imUser;
    }

    public final boolean getKeepEnterFrom() {
        return this.keepEnterFrom;
    }

    public final boolean getNoEvent() {
        return this.noEvent;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getRouterCallback() {
        return this.f103882c;
    }

    public final int getSelectMsgType() {
        return this.selectMsgType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getShareUserId() {
        return this.shareUserId;
    }

    public final String getStoryCollectionId() {
        return this.storyCollectionId;
    }

    public final String getStoryType() {
        return this.storyType;
    }

    public final String getThirdAppName() {
        return this.f103881b;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final boolean isStickyTop() {
        return this.isStickyTop;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.model.a$a  reason: collision with other inner class name */
    public static final class C2643a {

        /* renamed from: a  reason: collision with root package name */
        public a f103883a = new a(null);

        static {
            Covode.recordClassIndex(66559);
        }

        public final C2643a a() {
            this.f103883a.setKeepEnterFrom(true);
            return this;
        }

        public final C2643a b(int i2) {
            this.f103883a.setChatType(i2);
            return this;
        }

        public final C2643a c(int i2) {
            this.f103883a.setUnreadCount(i2);
            return this;
        }

        public final C2643a d(int i2) {
            this.f103883a.setFollowStatus(i2);
            return this;
        }

        public final C2643a e(String str) {
            this.f103883a.setGroupId(str);
            return this;
        }

        public final C2643a f(String str) {
            this.f103883a.setStoryType(str);
            return this;
        }

        public final C2643a a(int i2) {
            this.f103883a.setEnterFrom(i2);
            return this;
        }

        public final C2643a b(String str) {
            this.f103883a.setEnterMethodForMob(str);
            return this;
        }

        public final C2643a c(String str) {
            this.f103883a.setEnterFromForMob(str);
            return this;
        }

        public final C2643a d(String str) {
            this.f103883a.setButtonType(str);
            return this;
        }

        public final C2643a a(Context context) {
            this.f103883a.setContext(context);
            return this;
        }

        public final C2643a b(boolean z) {
            this.f103883a.setHasUnreadDot(z);
            return this;
        }

        public final C2643a a(IMContact iMContact) {
            this.f103883a.setImContact(iMContact);
            return this;
        }

        public final C2643a a(IMUser iMUser) {
            this.f103883a.setImUser(iMUser);
            return this;
        }

        public final C2643a a(e eVar) {
            this.f103883a.setImAdLog(eVar);
            return this;
        }

        public final C2643a a(Serializable serializable) {
            this.f103883a.setChatExt(serializable);
            return this;
        }

        public final C2643a a(String str) {
            this.f103883a.setSessionId(str);
            return this;
        }

        public final C2643a a(boolean z) {
            this.f103883a.setStickyTop(z);
            return this;
        }
    }

    public final String getUserId() {
        IMUser iMUser = this.imUser;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return "";
    }

    private a() {
        this.sessionId = "";
        this.chatType = -1;
        this.enterFromForMob = "";
        this.enterMethodForMob = "";
        this.groupId = "";
        this.followStatus = -1;
        this.storyType = "";
        this.storyCollectionId = "";
    }

    public /* synthetic */ a(g gVar) {
        this();
    }

    public final void setButtonType(String str) {
        this.buttonType = str;
    }

    public final void setChatExt(Serializable serializable) {
        this.chatExt = serializable;
    }

    public final void setChatType(int i2) {
        this.chatType = i2;
    }

    public final void setContext(Context context) {
        this.f103880a = context;
    }

    public final void setEnterFrom(int i2) {
        this.enterFrom = i2;
    }

    public final void setEnterFromForMob(String str) {
        this.enterFromForMob = str;
    }

    public final void setEnterFromSubPage(String str) {
        this.enterFromSubPage = str;
    }

    public final void setEnterMethodForMob(String str) {
        this.enterMethodForMob = str;
    }

    public final void setEnterSelectChatMsgActivity(boolean z) {
        this.enterSelectChatMsgActivity = z;
    }

    public final void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setHasUnreadDot(boolean z) {
        this.hasUnreadDot = z;
    }

    public final void setImAdLog(e eVar) {
        this.imAdLog = eVar;
    }

    public final void setImContact(IMContact iMContact) {
        this.imContact = iMContact;
    }

    public final void setImUser(IMUser iMUser) {
        this.imUser = iMUser;
    }

    public final void setKeepEnterFrom(boolean z) {
        this.keepEnterFrom = z;
    }

    public final void setNoEvent(boolean z) {
        this.noEvent = z;
    }

    public final void setRouterCallback(h.f.a.b<? super Boolean, z> bVar) {
        this.f103882c = bVar;
    }

    public final void setSelectMsgType(int i2) {
        this.selectMsgType = i2;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setShareUserId(String str) {
        this.shareUserId = str;
    }

    public final void setStickyTop(boolean z) {
        this.isStickyTop = z;
    }

    public final void setStoryCollectionId(String str) {
        this.storyCollectionId = str;
    }

    public final void setStoryType(String str) {
        this.storyType = str;
    }

    public final void setThirdAppName(String str) {
        this.f103881b = str;
    }

    public final void setUnreadCount(int i2) {
        this.unreadCount = i2;
    }
}
