import heapq

def min_time_to_view(N, X, exhibits):
    exhibits = [-ex for ex in exhibits]
    heapq.heapify(exhibits)

    time = 0
    total_friends = X * N

    while total_friends > 0:
        remaining_friends = X
        current_round_exhibits = []

        while remaining_friends > 0 and exhibits:
            largest_exhibit = -heapq.heappop(exhibits)
            if largest_exhibit <= 0:
                break

            if remaining_friends >= largest_exhibit:
                total_friends -= largest_exhibit
                remaining_friends -= largest_exhibit
            else:
                total_friends -= remaining_friends
                largest_exhibit -= remaining_friends
                remaining_friends = 0

            current_round_exhibits.append(-largest_exhibit)

        for cap in current_round_exhibits:
            heapq.heappush(exhibits, cap)

        time += 1

    return time

T = int(input().strip())
for _ in range(T):
    N, X = map(int, input().strip().split())
    capacities = list(map(int, input().strip().split()))
    print(min_time_to_view(N, X, capacities))
