package io.holunda.camunda.taskpool.view.auth

/**
 * Simple integration hook into auth of the final system.
 */
interface UserService {

  /**
   * Retrieves a user for given user identifier.
   * [userIdentifier] a token or a key identifying the user.
   * @return User
   * @throws UnknownUserException if user not found.
   */
  @Throws(UnknownUserException::class)
  fun getUser(userIdentifier: String): User

}

/**
 * Is thrown if the user is not known in the system.
 */
class UnknownUserException(reason: String) : IllegalArgumentException(reason)
