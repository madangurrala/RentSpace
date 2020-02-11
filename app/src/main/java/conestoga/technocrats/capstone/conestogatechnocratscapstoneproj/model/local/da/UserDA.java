package conestoga.technocrats.capstone.conestogatechnocratscapstoneproj.model.local.da;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import conestoga.technocrats.capstone.conestogatechnocratscapstoneproj.model.to.UserTO;

@Dao
public interface UserDA {
    @Insert
    public long insert(UserTO userTO);

    @Update
    public long update(UserTO userTO);

    @Delete
    public long delete(UserTO userTO);
}