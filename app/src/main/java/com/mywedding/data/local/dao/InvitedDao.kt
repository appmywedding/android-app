package com.mywedding.data.local.dao

import androidx.room.*
import com.mywedding.domain.model.Invited

@Dao
interface InvitedDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(invited: Invited)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(invited: Invited)

    @Delete
    fun delete(invited: Invited)

    @Query(
        """
        SELECT *
        FROM Invited
    """
    )
    fun getAll(): List<Invited>

    @Query(
        """
        SELECT *
        FROM Invited
        WHERE id = :id
    """
    )
    fun get(id: String): Invited
}