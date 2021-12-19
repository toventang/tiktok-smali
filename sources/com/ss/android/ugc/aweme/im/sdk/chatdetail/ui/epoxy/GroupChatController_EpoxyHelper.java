package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy;

import com.airbnb.epoxy.f;
import com.airbnb.epoxy.s;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.t;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.v;

public class GroupChatController_EpoxyHelper extends f<GroupChatController> {
    private s addMemberModel;
    private s approveModel;
    private final GroupChatController controller;
    private s dividerOne;
    private s dividerThree;
    private s dividerTwo;
    private s endGroupModel;
    private s groupMemberHeader;
    private s groupMemberSeeMore;
    private s groupTitleModel;
    private s inviteModel;
    private s leaveGroupModel;
    private s muteModel;
    private s pinModel;
    private s reportModel;
    private s reportSensitiveModel;
    private s requestSeeMore;

    static {
        Covode.recordClassIndex(65080);
    }

    private void saveModelsForNextValidation() {
        this.groupTitleModel = this.controller.groupTitleModel;
        this.groupMemberHeader = this.controller.groupMemberHeader;
        this.reportSensitiveModel = this.controller.reportSensitiveModel;
        this.dividerTwo = this.controller.dividerTwo;
        this.dividerOne = this.controller.dividerOne;
        this.leaveGroupModel = this.controller.leaveGroupModel;
        this.inviteModel = this.controller.inviteModel;
        this.groupMemberSeeMore = this.controller.groupMemberSeeMore;
        this.reportModel = this.controller.reportModel;
        this.requestSeeMore = this.controller.requestSeeMore;
        this.addMemberModel = this.controller.addMemberModel;
        this.muteModel = this.controller.muteModel;
        this.pinModel = this.controller.pinModel;
        this.endGroupModel = this.controller.endGroupModel;
        this.approveModel = this.controller.approveModel;
        this.dividerThree = this.controller.dividerThree;
    }

    private void validateModelsHaveNotChanged() {
        validateSameModel(this.groupTitleModel, this.controller.groupTitleModel, "groupTitleModel", -1);
        validateSameModel(this.groupMemberHeader, this.controller.groupMemberHeader, "groupMemberHeader", -2);
        validateSameModel(this.reportSensitiveModel, this.controller.reportSensitiveModel, "reportSensitiveModel", -3);
        validateSameModel(this.dividerTwo, this.controller.dividerTwo, "dividerTwo", -4);
        validateSameModel(this.dividerOne, this.controller.dividerOne, "dividerOne", -5);
        validateSameModel(this.leaveGroupModel, this.controller.leaveGroupModel, "leaveGroupModel", -6);
        validateSameModel(this.inviteModel, this.controller.inviteModel, "inviteModel", -7);
        validateSameModel(this.groupMemberSeeMore, this.controller.groupMemberSeeMore, "groupMemberSeeMore", -8);
        validateSameModel(this.reportModel, this.controller.reportModel, "reportModel", -9);
        validateSameModel(this.requestSeeMore, this.controller.requestSeeMore, "requestSeeMore", -10);
        validateSameModel(this.addMemberModel, this.controller.addMemberModel, "addMemberModel", -11);
        validateSameModel(this.muteModel, this.controller.muteModel, "muteModel", -12);
        validateSameModel(this.pinModel, this.controller.pinModel, "pinModel", -13);
        validateSameModel(this.endGroupModel, this.controller.endGroupModel, "endGroupModel", -14);
        validateSameModel(this.approveModel, this.controller.approveModel, "approveModel", -15);
        validateSameModel(this.dividerThree, this.controller.dividerThree, "dividerThree", -16);
        validateModelHashCodesHaveNotChanged(this.controller);
    }

    @Override // com.airbnb.epoxy.f
    public void resetAutoModels() {
        validateModelsHaveNotChanged();
        this.controller.groupTitleModel = new g();
        this.controller.groupTitleModel.i();
        setControllerToStageTo(this.controller.groupTitleModel, this.controller);
        this.controller.groupMemberHeader = new i();
        this.controller.groupMemberHeader.b(-2L);
        setControllerToStageTo(this.controller.groupMemberHeader, this.controller);
        this.controller.reportSensitiveModel = new r();
        this.controller.reportSensitiveModel.b(-3L);
        setControllerToStageTo(this.controller.reportSensitiveModel, this.controller);
        this.controller.dividerTwo = new t();
        this.controller.dividerTwo.b(-4L);
        setControllerToStageTo(this.controller.dividerTwo, this.controller);
        this.controller.dividerOne = new t();
        this.controller.dividerOne.b(-5L);
        setControllerToStageTo(this.controller.dividerOne, this.controller);
        this.controller.leaveGroupModel = new r();
        this.controller.leaveGroupModel.b(-6L);
        setControllerToStageTo(this.controller.leaveGroupModel, this.controller);
        this.controller.inviteModel = new k();
        this.controller.inviteModel.b(-7L);
        setControllerToStageTo(this.controller.inviteModel, this.controller);
        this.controller.groupMemberSeeMore = new p();
        this.controller.groupMemberSeeMore.b(-8L);
        setControllerToStageTo(this.controller.groupMemberSeeMore, this.controller);
        this.controller.reportModel = new k();
        this.controller.reportModel.b(-9L);
        setControllerToStageTo(this.controller.reportModel, this.controller);
        this.controller.requestSeeMore = new p();
        this.controller.requestSeeMore.b(-10L);
        setControllerToStageTo(this.controller.requestSeeMore, this.controller);
        this.controller.addMemberModel = new t();
        this.controller.addMemberModel.b(-11L);
        setControllerToStageTo(this.controller.addMemberModel, this.controller);
        this.controller.muteModel = new v();
        this.controller.muteModel.b(-12L);
        setControllerToStageTo(this.controller.muteModel, this.controller);
        this.controller.pinModel = new v();
        this.controller.pinModel.b(-13L);
        setControllerToStageTo(this.controller.pinModel, this.controller);
        this.controller.endGroupModel = new r();
        this.controller.endGroupModel.b(-14L);
        setControllerToStageTo(this.controller.endGroupModel, this.controller);
        this.controller.approveModel = new v();
        this.controller.approveModel.b(-15L);
        setControllerToStageTo(this.controller.approveModel, this.controller);
        this.controller.dividerThree = new t();
        this.controller.dividerThree.b(-16L);
        setControllerToStageTo(this.controller.dividerThree, this.controller);
        saveModelsForNextValidation();
    }

    public GroupChatController_EpoxyHelper(GroupChatController groupChatController) {
        this.controller = groupChatController;
    }

    private void validateSameModel(s sVar, s sVar2, String str, int i2) {
        if (sVar != sVar2) {
            throw new IllegalStateException("Fields annotated with AutoModel cannot be directly assigned. The controller manages these fields for you. (" + this.controller.getClass().getSimpleName() + "#" + str + ")");
        } else if (sVar2 != null && sVar2.f5077a != ((long) i2)) {
            throw new IllegalStateException("Fields annotated with AutoModel cannot have their id changed manually. The controller manages the ids of these models for you. (" + this.controller.getClass().getSimpleName() + "#" + str + ")");
        }
    }
}
