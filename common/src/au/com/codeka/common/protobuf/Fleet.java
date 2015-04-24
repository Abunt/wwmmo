// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.FLOAT;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

/**
 *
 * A fleet represents one or more ships of the same(?) design.
 */
public final class Fleet extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_EMPIRE_KEY = "";
  public static final Integer DEFAULT_ALLIANCE_ID = 0;
  public static final String DEFAULT_DESIGN_NAME = "";
  public static final Float DEFAULT_NUM_SHIPS = 0F;
  public static final FLEET_STATE DEFAULT_STATE = FLEET_STATE.IDLE;
  public static final Long DEFAULT_STATE_START_TIME = 0L;
  public static final String DEFAULT_STAR_KEY = "";
  public static final String DEFAULT_DESTINATION_STAR_KEY = "";
  public static final String DEFAULT_TARGET_FLEET_KEY = "";
  public static final String DEFAULT_TARGET_COLONY_KEY = "";
  public static final FLEET_STANCE DEFAULT_STANCE = FLEET_STANCE.PASSIVE;
  public static final Long DEFAULT_TIME_DESTROYED = 0L;
  public static final Boolean DEFAULT_BLOCK_NOTIFICATION_ON_DESTROY = false;
  public static final Long DEFAULT_LAST_VICTORY = 0L;
  public static final Long DEFAULT_ETA = 0L;
  public static final List<FleetUpgrade> DEFAULT_UPGRADES = Collections.emptyList();
  public static final String DEFAULT_NOTES = "";

  /**
   * The unique key for this fleet
   */
  @ProtoField(tag = 1, type = STRING)
  public String key;

  /**
   * The key of the empire who owns this fleet
   */
  @ProtoField(tag = 2, type = STRING)
  public String empire_key;

  /**
   * The ID of the alliance this fleet belongs to. If not specified, it means the
   * empire that owns this fleet does not belong to an alliance.
   */
  @ProtoField(tag = 18, type = INT32)
  public Integer alliance_id;

  /**
   * The name of the ship design of the ship(s) in this fleet
   */
  @ProtoField(tag = 3, type = STRING)
  public String design_name;

  /**
   * The number of ships in this fleet. This is a floating point number because of the way
   * damage is calculated in combat. We only ever display the Math.ceil() of this number to
   * the user, however.
   */
  @ProtoField(tag = 4, type = FLOAT)
  public Float num_ships;

  @ProtoField(tag = 5, type = ENUM)
  public FLEET_STATE state;

  /**
   * The time this fleet was moved into the current state (used to determine things like
   * distance between planets when moving, etc)
   */
  @ProtoField(tag = 6, type = INT64)
  public Long state_start_time;

  /**
   * The star this fleet is associated with. If moving, star_key is the star we're moving
   * FROM and destination_star_key is the star we're moving TO.
   */
  @ProtoField(tag = 7, type = STRING)
  public String star_key;

  @ProtoField(tag = 8, type = STRING)
  public String destination_star_key;

  /**
   * If in attacking state, this is the target fleet or colony we're attacking
   */
  @ProtoField(tag = 9, type = STRING)
  public String target_fleet_key;

  @ProtoField(tag = 10, type = STRING)
  public String target_colony_key;

  @ProtoField(tag = 11, type = ENUM)
  public FLEET_STANCE stance;

  /**
   * This is used internally by the server, it'll never appear in a response from the server.
   */
  @ProtoField(tag = 12, type = INT64)
  public Long time_destroyed;

  @ProtoField(tag = 14, type = BOOL)
  public Boolean block_notification_on_destroy;

  /**
   * This is the date/time of the last battle this fleet was victorious in,
   * it's mostly useless on the client (used for some housekeeping on the
   * server)
   */
  @ProtoField(tag = 13, type = INT64)
  public Long last_victory;

  /**
   * for moving fleets, this is the time we expect it to arrive
   */
  @ProtoField(tag = 15, type = INT64)
  public Long eta;

  /**
   * a collection of upgrades to this fleet
   */
  @ProtoField(tag = 16, label = REPEATED, messageType = FleetUpgrade.class)
  public List<FleetUpgrade> upgrades;

  /**
   * notes the player has attached so that he can remember what the fleet was for.
   */
  @ProtoField(tag = 17, type = STRING)
  public String notes;

  public Fleet() {
  }

  public Fleet(String key, String empire_key, Integer alliance_id, String design_name, Float num_ships, FLEET_STATE state, Long state_start_time, String star_key, String destination_star_key, String target_fleet_key, String target_colony_key, FLEET_STANCE stance, Long time_destroyed, Boolean block_notification_on_destroy, Long last_victory, Long eta, List<FleetUpgrade> upgrades, String notes) {
    this.key = key;
    this.empire_key = empire_key;
    this.alliance_id = alliance_id;
    this.design_name = design_name;
    this.num_ships = num_ships;
    this.state = state;
    this.state_start_time = state_start_time;
    this.star_key = star_key;
    this.destination_star_key = destination_star_key;
    this.target_fleet_key = target_fleet_key;
    this.target_colony_key = target_colony_key;
    this.stance = stance;
    this.time_destroyed = time_destroyed;
    this.block_notification_on_destroy = block_notification_on_destroy;
    this.last_victory = last_victory;
    this.eta = eta;
    this.upgrades = copyOf(upgrades);
    this.notes = notes;
  }

  private Fleet(Builder builder) {
    this(builder.key, builder.empire_key, builder.alliance_id, builder.design_name, builder.num_ships, builder.state, builder.state_start_time, builder.star_key, builder.destination_star_key, builder.target_fleet_key, builder.target_colony_key, builder.stance, builder.time_destroyed, builder.block_notification_on_destroy, builder.last_victory, builder.eta, builder.upgrades, builder.notes);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Fleet)) return false;
    Fleet o = (Fleet) other;
    return equals(key, o.key)
        && equals(empire_key, o.empire_key)
        && equals(alliance_id, o.alliance_id)
        && equals(design_name, o.design_name)
        && equals(num_ships, o.num_ships)
        && equals(state, o.state)
        && equals(state_start_time, o.state_start_time)
        && equals(star_key, o.star_key)
        && equals(destination_star_key, o.destination_star_key)
        && equals(target_fleet_key, o.target_fleet_key)
        && equals(target_colony_key, o.target_colony_key)
        && equals(stance, o.stance)
        && equals(time_destroyed, o.time_destroyed)
        && equals(block_notification_on_destroy, o.block_notification_on_destroy)
        && equals(last_victory, o.last_victory)
        && equals(eta, o.eta)
        && equals(upgrades, o.upgrades)
        && equals(notes, o.notes);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (empire_key != null ? empire_key.hashCode() : 0);
      result = result * 37 + (alliance_id != null ? alliance_id.hashCode() : 0);
      result = result * 37 + (design_name != null ? design_name.hashCode() : 0);
      result = result * 37 + (num_ships != null ? num_ships.hashCode() : 0);
      result = result * 37 + (state != null ? state.hashCode() : 0);
      result = result * 37 + (state_start_time != null ? state_start_time.hashCode() : 0);
      result = result * 37 + (star_key != null ? star_key.hashCode() : 0);
      result = result * 37 + (destination_star_key != null ? destination_star_key.hashCode() : 0);
      result = result * 37 + (target_fleet_key != null ? target_fleet_key.hashCode() : 0);
      result = result * 37 + (target_colony_key != null ? target_colony_key.hashCode() : 0);
      result = result * 37 + (stance != null ? stance.hashCode() : 0);
      result = result * 37 + (time_destroyed != null ? time_destroyed.hashCode() : 0);
      result = result * 37 + (block_notification_on_destroy != null ? block_notification_on_destroy.hashCode() : 0);
      result = result * 37 + (last_victory != null ? last_victory.hashCode() : 0);
      result = result * 37 + (eta != null ? eta.hashCode() : 0);
      result = result * 37 + (upgrades != null ? upgrades.hashCode() : 1);
      result = result * 37 + (notes != null ? notes.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Fleet> {

    public String key;
    public String empire_key;
    public Integer alliance_id;
    public String design_name;
    public Float num_ships;
    public FLEET_STATE state;
    public Long state_start_time;
    public String star_key;
    public String destination_star_key;
    public String target_fleet_key;
    public String target_colony_key;
    public FLEET_STANCE stance;
    public Long time_destroyed;
    public Boolean block_notification_on_destroy;
    public Long last_victory;
    public Long eta;
    public List<FleetUpgrade> upgrades;
    public String notes;

    public Builder() {
    }

    public Builder(Fleet message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.empire_key = message.empire_key;
      this.alliance_id = message.alliance_id;
      this.design_name = message.design_name;
      this.num_ships = message.num_ships;
      this.state = message.state;
      this.state_start_time = message.state_start_time;
      this.star_key = message.star_key;
      this.destination_star_key = message.destination_star_key;
      this.target_fleet_key = message.target_fleet_key;
      this.target_colony_key = message.target_colony_key;
      this.stance = message.stance;
      this.time_destroyed = message.time_destroyed;
      this.block_notification_on_destroy = message.block_notification_on_destroy;
      this.last_victory = message.last_victory;
      this.eta = message.eta;
      this.upgrades = copyOf(message.upgrades);
      this.notes = message.notes;
    }

    /**
     * The unique key for this fleet
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The key of the empire who owns this fleet
     */
    public Builder empire_key(String empire_key) {
      this.empire_key = empire_key;
      return this;
    }

    /**
     * The ID of the alliance this fleet belongs to. If not specified, it means the
     * empire that owns this fleet does not belong to an alliance.
     */
    public Builder alliance_id(Integer alliance_id) {
      this.alliance_id = alliance_id;
      return this;
    }

    /**
     * The name of the ship design of the ship(s) in this fleet
     */
    public Builder design_name(String design_name) {
      this.design_name = design_name;
      return this;
    }

    /**
     * The number of ships in this fleet. This is a floating point number because of the way
     * damage is calculated in combat. We only ever display the Math.ceil() of this number to
     * the user, however.
     */
    public Builder num_ships(Float num_ships) {
      this.num_ships = num_ships;
      return this;
    }

    public Builder state(FLEET_STATE state) {
      this.state = state;
      return this;
    }

    /**
     * The time this fleet was moved into the current state (used to determine things like
     * distance between planets when moving, etc)
     */
    public Builder state_start_time(Long state_start_time) {
      this.state_start_time = state_start_time;
      return this;
    }

    /**
     * The star this fleet is associated with. If moving, star_key is the star we're moving
     * FROM and destination_star_key is the star we're moving TO.
     */
    public Builder star_key(String star_key) {
      this.star_key = star_key;
      return this;
    }

    public Builder destination_star_key(String destination_star_key) {
      this.destination_star_key = destination_star_key;
      return this;
    }

    /**
     * If in attacking state, this is the target fleet or colony we're attacking
     */
    public Builder target_fleet_key(String target_fleet_key) {
      this.target_fleet_key = target_fleet_key;
      return this;
    }

    public Builder target_colony_key(String target_colony_key) {
      this.target_colony_key = target_colony_key;
      return this;
    }

    public Builder stance(FLEET_STANCE stance) {
      this.stance = stance;
      return this;
    }

    /**
     * This is used internally by the server, it'll never appear in a response from the server.
     */
    public Builder time_destroyed(Long time_destroyed) {
      this.time_destroyed = time_destroyed;
      return this;
    }

    public Builder block_notification_on_destroy(Boolean block_notification_on_destroy) {
      this.block_notification_on_destroy = block_notification_on_destroy;
      return this;
    }

    /**
     * This is the date/time of the last battle this fleet was victorious in,
     * it's mostly useless on the client (used for some housekeeping on the
     * server)
     */
    public Builder last_victory(Long last_victory) {
      this.last_victory = last_victory;
      return this;
    }

    /**
     * for moving fleets, this is the time we expect it to arrive
     */
    public Builder eta(Long eta) {
      this.eta = eta;
      return this;
    }

    /**
     * a collection of upgrades to this fleet
     */
    public Builder upgrades(List<FleetUpgrade> upgrades) {
      this.upgrades = checkForNulls(upgrades);
      return this;
    }

    /**
     * notes the player has attached so that he can remember what the fleet was for.
     */
    public Builder notes(String notes) {
      this.notes = notes;
      return this;
    }

    @Override
    public Fleet build() {
      return new Fleet(this);
    }
  }

  public enum FLEET_STATE
      implements ProtoEnum {
    IDLE(1),
    MOVING(2),
    ATTACKING(3);

    private final int value;

    private FLEET_STATE(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum FLEET_STANCE
      implements ProtoEnum {
    PASSIVE(1),
    NEUTRAL(2),
    AGGRESSIVE(3);

    private final int value;

    private FLEET_STANCE(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
