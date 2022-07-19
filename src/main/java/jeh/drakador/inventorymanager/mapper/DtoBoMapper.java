package jeh.drakador.inventorymanager.mapper;

public interface DtoBoMapper<T, U> {

    /**
     * Convert BO to DTO
     *
     * @param localBo the local bo
     * @return New DTO
     */
    T toDto(U localBo);

    /**
     * Convert DTO to BO
     *
     * @param localDto the local dto
     * @return New BO
     */
    U toBo(T localDto);

    /**
     * Update BO U from DTO T
     *
     * @param localDto the local dto
     * @return Updated BO
     */
    U updateBo(T localDto, U localBo);
}
