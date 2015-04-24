// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

/**
 *
 * The "hello" message is returned when you first connect to the game.
 */
public final class HelloResponse extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<Colony> DEFAULT_COLONIES = Collections.emptyList();
  public static final Boolean DEFAULT_REQUIRE_GCM_REGISTER = false;
  public static final Boolean DEFAULT_WAS_EMPIRE_RESET = false;
  public static final String DEFAULT_EMPIRE_RESET_REASON = "";
  public static final List<BuildRequest> DEFAULT_BUILD_REQUESTS = Collections.emptyList();
  public static final Boolean DEFAULT_FORCE_REMOVE_ADS = false;
  public static final List<Long> DEFAULT_STAR_IDS = Collections.emptyList();

  /**
   * The current message of the day.
   */
  @ProtoField(tag = 1)
  public MessageOfTheDay motd;

  /**
   * If specified, the Empire you're currently logged in as (if not specified, it means
   * you haven't set up an empire yet, and you should do that before anything else...)
   */
  @ProtoField(tag = 2)
  public Empire empire;

  /**
   * The list of colonies your empire owns. Typically, you'll want to start the
   * starfield view centred on one of your own colonies...
   */
  @ProtoField(tag = 3, label = REPEATED, messageType = Colony.class)
  public List<Colony> colonies;

  /**
   * If true, it means we need to re-register with GCM (maybe because last time it failed)
   */
  @ProtoField(tag = 6, type = BOOL)
  public Boolean require_gcm_register;

  /**
   * If present and true, it means your empire was reset (probably because your last colony
   * was destroyed). Display some kind of message to the user to that effect. If
   * empire_reset_reason is set, this is an administrator-specified reason for the reset
   * (eg violation of rules, etc etc). If it's not set, the reason is just that you've run
   * out of colonies.
   */
  @ProtoField(tag = 7, type = BOOL)
  public Boolean was_empire_reset;

  @ProtoField(tag = 10, type = STRING)
  public String empire_reset_reason;

  /**
   * Building statistics that details the number of buildings of each design your empire
   * has, once you've got it on the client, it can be kept track there...
   */
  @ProtoField(tag = 8)
  public EmpireBuildingStatistics building_statistics;

  /**
   * The collection of build requests. Once we've got the initial list from the server, the
   * client is able to track them itself.
   */
  @ProtoField(tag = 9, label = REPEATED, messageType = BuildRequest.class)
  public List<BuildRequest> build_requests;

  /**
   * If true, we'll force the ads to be removed. If false, or not specified, we'll check
   * whatever the In-App Purchase API has to say.
   */
  @ProtoField(tag = 11, type = BOOL)
  public Boolean force_remove_ads;

  /**
   * this is the list of all the stars this empire owns
   */
  @ProtoField(tag = 12, type = INT64, label = REPEATED)
  public List<Long> star_ids;

  public HelloResponse() {
  }

  public HelloResponse(MessageOfTheDay motd, Empire empire, List<Colony> colonies, Boolean require_gcm_register, Boolean was_empire_reset, String empire_reset_reason, EmpireBuildingStatistics building_statistics, List<BuildRequest> build_requests, Boolean force_remove_ads, List<Long> star_ids) {
    this.motd = motd;
    this.empire = empire;
    this.colonies = copyOf(colonies);
    this.require_gcm_register = require_gcm_register;
    this.was_empire_reset = was_empire_reset;
    this.empire_reset_reason = empire_reset_reason;
    this.building_statistics = building_statistics;
    this.build_requests = copyOf(build_requests);
    this.force_remove_ads = force_remove_ads;
    this.star_ids = copyOf(star_ids);
  }

  private HelloResponse(Builder builder) {
    this(builder.motd, builder.empire, builder.colonies, builder.require_gcm_register, builder.was_empire_reset, builder.empire_reset_reason, builder.building_statistics, builder.build_requests, builder.force_remove_ads, builder.star_ids);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HelloResponse)) return false;
    HelloResponse o = (HelloResponse) other;
    return equals(motd, o.motd)
        && equals(empire, o.empire)
        && equals(colonies, o.colonies)
        && equals(require_gcm_register, o.require_gcm_register)
        && equals(was_empire_reset, o.was_empire_reset)
        && equals(empire_reset_reason, o.empire_reset_reason)
        && equals(building_statistics, o.building_statistics)
        && equals(build_requests, o.build_requests)
        && equals(force_remove_ads, o.force_remove_ads)
        && equals(star_ids, o.star_ids);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = motd != null ? motd.hashCode() : 0;
      result = result * 37 + (empire != null ? empire.hashCode() : 0);
      result = result * 37 + (colonies != null ? colonies.hashCode() : 1);
      result = result * 37 + (require_gcm_register != null ? require_gcm_register.hashCode() : 0);
      result = result * 37 + (was_empire_reset != null ? was_empire_reset.hashCode() : 0);
      result = result * 37 + (empire_reset_reason != null ? empire_reset_reason.hashCode() : 0);
      result = result * 37 + (building_statistics != null ? building_statistics.hashCode() : 0);
      result = result * 37 + (build_requests != null ? build_requests.hashCode() : 1);
      result = result * 37 + (force_remove_ads != null ? force_remove_ads.hashCode() : 0);
      result = result * 37 + (star_ids != null ? star_ids.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<HelloResponse> {

    public MessageOfTheDay motd;
    public Empire empire;
    public List<Colony> colonies;
    public Boolean require_gcm_register;
    public Boolean was_empire_reset;
    public String empire_reset_reason;
    public EmpireBuildingStatistics building_statistics;
    public List<BuildRequest> build_requests;
    public Boolean force_remove_ads;
    public List<Long> star_ids;

    public Builder() {
    }

    public Builder(HelloResponse message) {
      super(message);
      if (message == null) return;
      this.motd = message.motd;
      this.empire = message.empire;
      this.colonies = copyOf(message.colonies);
      this.require_gcm_register = message.require_gcm_register;
      this.was_empire_reset = message.was_empire_reset;
      this.empire_reset_reason = message.empire_reset_reason;
      this.building_statistics = message.building_statistics;
      this.build_requests = copyOf(message.build_requests);
      this.force_remove_ads = message.force_remove_ads;
      this.star_ids = copyOf(message.star_ids);
    }

    /**
     * The current message of the day.
     */
    public Builder motd(MessageOfTheDay motd) {
      this.motd = motd;
      return this;
    }

    /**
     * If specified, the Empire you're currently logged in as (if not specified, it means
     * you haven't set up an empire yet, and you should do that before anything else...)
     */
    public Builder empire(Empire empire) {
      this.empire = empire;
      return this;
    }

    /**
     * The list of colonies your empire owns. Typically, you'll want to start the
     * starfield view centred on one of your own colonies...
     */
    public Builder colonies(List<Colony> colonies) {
      this.colonies = checkForNulls(colonies);
      return this;
    }

    /**
     * If true, it means we need to re-register with GCM (maybe because last time it failed)
     */
    public Builder require_gcm_register(Boolean require_gcm_register) {
      this.require_gcm_register = require_gcm_register;
      return this;
    }

    /**
     * If present and true, it means your empire was reset (probably because your last colony
     * was destroyed). Display some kind of message to the user to that effect. If
     * empire_reset_reason is set, this is an administrator-specified reason for the reset
     * (eg violation of rules, etc etc). If it's not set, the reason is just that you've run
     * out of colonies.
     */
    public Builder was_empire_reset(Boolean was_empire_reset) {
      this.was_empire_reset = was_empire_reset;
      return this;
    }

    public Builder empire_reset_reason(String empire_reset_reason) {
      this.empire_reset_reason = empire_reset_reason;
      return this;
    }

    /**
     * Building statistics that details the number of buildings of each design your empire
     * has, once you've got it on the client, it can be kept track there...
     */
    public Builder building_statistics(EmpireBuildingStatistics building_statistics) {
      this.building_statistics = building_statistics;
      return this;
    }

    /**
     * The collection of build requests. Once we've got the initial list from the server, the
     * client is able to track them itself.
     */
    public Builder build_requests(List<BuildRequest> build_requests) {
      this.build_requests = checkForNulls(build_requests);
      return this;
    }

    /**
     * If true, we'll force the ads to be removed. If false, or not specified, we'll check
     * whatever the In-App Purchase API has to say.
     */
    public Builder force_remove_ads(Boolean force_remove_ads) {
      this.force_remove_ads = force_remove_ads;
      return this;
    }

    /**
     * this is the list of all the stars this empire owns
     */
    public Builder star_ids(List<Long> star_ids) {
      this.star_ids = checkForNulls(star_ids);
      return this;
    }

    @Override
    public HelloResponse build() {
      return new HelloResponse(this);
    }
  }
}
